package SistemaTransporteAereo.model;


public class Avioes {

    private int numeroIdentificacao;
    private String nome;


    public Avioes(int numeroIdentificacao, String nome) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.nome = nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
