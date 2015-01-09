package br.com.domsantos.medidor.model;

import javax.persistence.*;

/**
 * Created by domingos on 08/01/15.
 */
@Entity(name = "apuracao")
public class Apuracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "id_questao", referencedColumnName = "id")
    private Questao questao;
    @JoinColumn(name = "id_resposta", referencedColumnName = "id")
    private Resposta resposta;
    @JoinColumn(name = "id_entrevistado", referencedColumnName = "id")
    private Entrevistado entrevistado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public Entrevistado getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(Entrevistado entrevistado) {
        this.entrevistado = entrevistado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apuracao)) return false;

        Apuracao apuracao = (Apuracao) o;

        if (entrevistado != null ? !entrevistado.equals(apuracao.entrevistado) : apuracao.entrevistado != null)
            return false;
        if (id != null ? !id.equals(apuracao.id) : apuracao.id != null) return false;
        if (questao != null ? !questao.equals(apuracao.questao) : apuracao.questao != null) return false;
        if (resposta != null ? !resposta.equals(apuracao.resposta) : apuracao.resposta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (questao != null ? questao.hashCode() : 0);
        result = 31 * result + (resposta != null ? resposta.hashCode() : 0);
        result = 31 * result + (entrevistado != null ? entrevistado.hashCode() : 0);
        return result;
    }
}
