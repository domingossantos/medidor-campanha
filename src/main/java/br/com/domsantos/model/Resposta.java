package br.com.domsantos.model;

import javax.persistence.*;

/**
 * Created by domingos on 07/01/15.
 */
@Entity
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resposta;
    @JoinColumn(name = "id_campanha", referencedColumnName = "id")
    private Campanha campanha;
}
