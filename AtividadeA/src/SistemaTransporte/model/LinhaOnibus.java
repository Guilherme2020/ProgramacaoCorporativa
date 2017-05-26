package SistemaTransporte.model;


import java.util.ArrayList;

public class LinhaOnibus {
   private  int numero;
   private String descricao;
   private Empresa nomeEmpresa;
   private String sentidoLinha;
   private ArrayList<Paradas> paradas;

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public Empresa getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getSentidoLinha() {
        return sentidoLinha;
    }

    public ArrayList<Paradas> getParadas() {
        return paradas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNomeEmpresa(Empresa nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setSentidoLinha(String sentidoLinha) {
        this.sentidoLinha = sentidoLinha;
    }

    public void setParadas(ArrayList<Paradas> paradas) {
        this.paradas = paradas;
    }
}
