package SistemaTransporte.model;

import java.util.ArrayList;


public class Onibus {

    private LinhaOnibus numeroLinha;
	private int numeroIdentificacao;
    private ArrayList<Funcionarios> funcionarios;

    public Onibus(LinhaOnibus numeroLinha, int numeroIdentificacao, ArrayList<Funcionarios> funcionarios) {
        this.numeroLinha = numeroLinha;
        this.numeroIdentificacao = numeroIdentificacao;
        this.funcionarios = funcionarios;
    }

    public LinhaOnibus getNumeroLinha() {
        return numeroLinha;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setNumeroLinha(LinhaOnibus numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
