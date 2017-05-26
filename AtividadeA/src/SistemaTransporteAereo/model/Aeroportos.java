package SistemaTransporteAereo.model;


import java.util.List;

public class Aeroportos {

    private List<Avioes> quantidadeAvioes;
    private String nomeAeroporto;
    private String endereco;
    private int quantidadeVoosDisponiveis;

    public Aeroportos(List<Avioes> quantidadeAvioes, String nomeAeroporto, String endereco, int quantidadeVoosDisponiveis) {
        this.quantidadeAvioes = quantidadeAvioes;
        this.nomeAeroporto = nomeAeroporto;
        this.endereco = endereco;
        this.quantidadeVoosDisponiveis = quantidadeVoosDisponiveis;
    }

    public List<Avioes> getQuantidadeAvioes() {
        return quantidadeAvioes;
    }

    public void setQuantidadeAvioes(List<Avioes> quantidadeAvioes) {
        this.quantidadeAvioes = quantidadeAvioes;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeVoosDisponiveis() {
        return quantidadeVoosDisponiveis;
    }

    public void setQuantidadeVoosDisponiveis(int quantidadeVoosDisponiveis) {
        this.quantidadeVoosDisponiveis = quantidadeVoosDisponiveis;
    }
}
