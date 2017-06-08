package SistemaTransporte.model;


import java.util.ArrayList;

public class Empresa {
    private ArrayList<Onibus> onibus;
	private String local;
    private ArrayList<Funcionarios> funcionarios;
	private ArrayList<LinhaOnibus> nomeLinha;


    public Empresa(ArrayList<Onibus> onibus, String local, ArrayList<Funcionarios> funcionarios, ArrayList<LinhaOnibus> nomeLinha) {
        this.onibus = onibus;
        this.local = local;
        this.funcionarios = funcionarios;
        this.nomeLinha = nomeLinha;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public String getLocal() {
        return local;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<LinhaOnibus> getNomeLinha() {
        return nomeLinha;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setFuncionarios(ArrayList<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setNomeLinha(ArrayList<LinhaOnibus> nomeLinha) {
        this.nomeLinha = nomeLinha;
    }
}
