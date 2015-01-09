package br.com.domsantos.medidor.model;

import javax.persistence.*;

/**
 * Created by domingos on 07/01/15.
 */
@Entity
public class CanalCampanha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "id_canal", referencedColumnName = "id")
    private Canal canal;
    @JoinColumn(name = "id_campanha", referencedColumnName = "id")
    private Campanha campanha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CanalCampanha)) return false;

        CanalCampanha that = (CanalCampanha) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
