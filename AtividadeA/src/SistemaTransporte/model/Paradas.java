package SistemaTransporte.model;


import java.util.ArrayList;

public class Paradas {


    private ArrayList<LinhaOnibus> linha;
    private String bairro;
    private String cidade;


    public Paradas(ArrayList<LinhaOnibus> linha, String bairro, String cidade) {
        this.linha = linha;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public ArrayList<LinhaOnibus> getLinha() {
        return linha;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setLinha(ArrayList<LinhaOnibus> linha) {
        this.linha = linha;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
