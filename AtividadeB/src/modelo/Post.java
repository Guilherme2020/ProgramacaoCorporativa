package modelo;


import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class Post {

    private Calendar data;
    private Publicacoes publicacoes;
    private Set<Usuarios> marcacoes;
    private Grupo grupo;
    private List<Comentario> comentario;

    public Post(Calendar data, Publicacoes publicacoes, Set<Usuarios> marcacoes, Grupo grupo, List<Comentario> comentario) {
        this.data = data;
        this.publicacoes = publicacoes;
        this.marcacoes = marcacoes;
        this.grupo = grupo;
        this.comentario = comentario;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Publicacoes getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacoes publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Set<Usuarios> getMarcacoes() {
        return marcacoes;
    }

    public void setMarcacoes(Set<Usuarios> marcacoes) {
        this.marcacoes = marcacoes;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }
}
