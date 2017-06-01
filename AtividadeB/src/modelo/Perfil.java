package modelo;

import java.util.List;
import java.util.Set;

public class Perfil {
    private String foto;
    private Set<?>  solicitacoesAmizade;
    private List<?> grupos;
    private String descricao;
    private Set<Post> posts;

    public Perfil(String foto, Set<?> solicitacoesAmizade, List<?> grupos, String descricao, Set<Post> posts) {
        this.foto = foto;
        this.solicitacoesAmizade = solicitacoesAmizade;
        this.grupos = grupos;
        this.descricao = descricao;
        this.posts = posts;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Set<?> getSolicitacoesAmizade() {
        return solicitacoesAmizade;
    }

    public void setSolicitacoesAmizade(Set<?> solicitacoesAmizade) {
        this.solicitacoesAmizade = solicitacoesAmizade;
    }

    public List<?> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<?> grupos) {
        this.grupos = grupos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
