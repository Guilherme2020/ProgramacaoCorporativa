package modelo;

import java.util.*;
public class Paginas {

    private Set<Publicacoes> publicacoes;
    private  Set<Anuncios> Anuncios;
    private Set<Curtida> curtidas;

    public Paginas(Set<Publicacoes> publicacoes, Set<modelo.Anuncios> anuncios, Set<Curtida> curtidas) {
        this.publicacoes = publicacoes;
        Anuncios = anuncios;
        this.curtidas = curtidas;

    }


    public Set<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Set<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Set<modelo.Anuncios> getAnuncios() {
        return Anuncios;
    }

    public void setAnuncios(Set<modelo.Anuncios> anuncios) {
        Anuncios = anuncios;
    }

    public Set<Curtida> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Set<Curtida> curtidas) {
        this.curtidas = curtidas;
    }
}
