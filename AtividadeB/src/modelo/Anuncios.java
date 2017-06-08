package modelo;

import  java.util.*;

public class Anuncios {

    private String descricao;
    private Set<Paginas> paginas;
    private String interesses;
    private String configuracao;

    public Anuncios(String descricao, Set<Paginas> paginas, String interesses, String configuracao) {
        this.descricao = descricao;
        this.paginas = paginas;
        this.interesses = interesses;
        this.configuracao = configuracao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Paginas> getPaginas() {
        return paginas;
    }

    public void setPaginas(Set<Paginas> paginas) {
        this.paginas = paginas;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
