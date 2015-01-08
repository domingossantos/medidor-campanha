package br.com.domsantos.model;

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
}
