package modelo;


import java.util.List;

public class LinhaTempo {

    private List<Publicacoes> publicacoes;

    public LinhaTempo(List<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public List<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
