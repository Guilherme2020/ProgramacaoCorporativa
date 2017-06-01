package modelo;


import java.util.Calendar;

public class Post {

    private Calendar data;
    private Publicacoes publicacoes;

    public Post(Calendar data, Publicacoes publicacoes) {
        this.data = data;
        this.publicacoes = publicacoes;
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
}
