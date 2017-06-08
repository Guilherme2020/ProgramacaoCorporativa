package modelo;


import java.util.List;

public class Comentario {

    private Usuarios usuario;
    private Post comentarios;
    private List<String> respostas;

    public Comentario(Usuarios usuario, Post comentarios, List<String> respostas) {
        this.usuario = usuario;
        this.comentarios = comentarios;
        this.respostas = respostas;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Post getComentarios() {
        return comentarios;
    }

    public void setComentarios(Post comentarios) {
        this.comentarios = comentarios;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
}
