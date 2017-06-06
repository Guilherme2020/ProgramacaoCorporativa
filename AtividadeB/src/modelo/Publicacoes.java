package modelo;


import java.util.List;

public class Publicacoes {

    private List<Post> posts;

    public Publicacoes(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {return posts;}

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
