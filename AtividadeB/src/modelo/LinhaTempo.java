package modelo;


import java.util.List;

public class LinhaTempo {

    private List<Publicacoes> publicacoes;
    private List<Anuncios> anuncios;
    private List<String> notificacoes;
    public LinhaTempo(List<Publicacoes> publicacoes, List<Anuncios> anuncios, List<String> notificacoes) {
        this.publicacoes = publicacoes;
        this.anuncios = anuncios;
        this.notificacoes = notificacoes;
    }

    public List<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public List<Anuncios> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncios> anuncios) {
        this.anuncios = anuncios;
    }

    public List<String> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<String> notificacoes) {
        this.notificacoes = notificacoes;
    }
}
