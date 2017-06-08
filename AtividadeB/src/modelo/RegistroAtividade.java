package modelo;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class RegistroAtividade {

    private Set<Curtida> curtidas;
    private Set<Comentario> comentarios;
    private List<Publicacoes> publicacoes;
    private Calendar dataAtividade;

    public RegistroAtividade(Set<Curtida> curtidas, Set<Comentario> comentarios, List<Publicacoes> publicacoes, Calendar dataAtividade) {
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.publicacoes = publicacoes;
        this.dataAtividade = dataAtividade;
    }

    public Set<Curtida> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Set<Curtida> curtidas) {
        this.curtidas = curtidas;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Calendar getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(Calendar dataAtividade) {
        this.dataAtividade = dataAtividade;
    }
}
