package modelo;


import java.util.Calendar;
import java.util.Set;

public class Grupo {
    private Set<Usuarios> membros;
    private Set<Publicacoes> publicacoes;
    private Calendar dataCriacao;
    private String descricao;
    private Set<String> eventos;
    private Set<Anuncios> anuncios;

    public Grupo(Set<Usuarios> membros, Set<Publicacoes> publicacoes, Calendar dataCriacao, String descricao, Set<String> eventos, Set<Anuncios> anuncios) {
        this.membros = membros;
        this.publicacoes = publicacoes;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.eventos = eventos;
        this.anuncios = anuncios;
    }


    public Set<Usuarios> getMembros() {
        return membros;
    }

    public void setMembros(Set<Usuarios> membros) {
        this.membros = membros;
    }

    public Set<Publicacoes> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Set<Publicacoes> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<String> getEventos() {
        return eventos;
    }

    public void setEventos(Set<String> eventos) {
        this.eventos = eventos;
    }

    public Set<Anuncios> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(Set<Anuncios> anuncios) {
        this.anuncios = anuncios;
    }
}
