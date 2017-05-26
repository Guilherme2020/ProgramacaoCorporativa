package SistemaTransporte.model;


public class Fiscal extends Funcionarios {

    private String nomeFuncionario;
    private int numeroIdentificacao;

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
}
