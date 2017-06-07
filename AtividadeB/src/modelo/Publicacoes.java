package modelo;


import java.util.List;

public class Publicacoes {

    private List<Post> posts;
    private String atividade;
    private String privacidade;

    public Publicacoes(List<Post> posts, String atividade, String privacidade) {
        this.posts = posts;
        this.atividade = atividade;
        this.privacidade = privacidade;
    }

    public List<Post> getPosts() {return posts;}

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getPrivacidade() {
        return privacidade;
    }

    public void setPrivacidade(String privacidade) {
        this.privacidade = privacidade;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
