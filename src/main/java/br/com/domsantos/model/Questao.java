package br.com.domsantos.model;

import javax.persistence.*;

/**
 * Created by domingos on 07/01/15.
 */
@Entity
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enunciado;
    @JoinColumn(name = "id_resposta", referencedColumnName = "id")
    private Resposta resposta;
    @JoinColumn(name = "id_campanha", referencedColumnName = "id")
    private Campanha campanha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }
}
