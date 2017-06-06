package modelo;

import java.util.List;
import java.util.Set;

public class Perfil {
    private String foto;
    private Set<String> fotosPreferidas;
    private Set<Amigos>  solicitacoesAmizade;
    private List<Grupo> grupos;
    private String descricao;
    private Set<Post> posts;

    public Perfil(String foto,Set<String> fotosPreferidas, Set<Amigos> solicitacoesAmizade, List<Grupo> grupos, String descricao, Set<Post> posts) {
        this.foto = foto;
        this.fotosPreferidas = fotosPreferidas;
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

    public Set<String> getFotoPreferida() {return fotosPreferidas;}

    public Set<Amigos> getSolicitacoesAmizade() {
        return solicitacoesAmizade;
    }

    public void setSolicitacoesAmizade(Set<Amigos> solicitacoesAmizade) {
        this.solicitacoesAmizade = solicitacoesAmizade;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
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
