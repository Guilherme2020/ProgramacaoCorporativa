package SistemaTransporte.model;


public class Cobrador extends Funcionarios {
    private String nomeFuncionario;
    private int numeroIdentificacao;

    public Cobrador(String nomeFuncionario, int numeroIdentificacao) {
        super(nomeFuncionario, numeroIdentificacao);
    }


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
