package SistemaMilhas.model;


import java.util.Calendar;

public class Viagens {

    private Calendar dataViagem;
    private int quantidadePontosGerados;
    private double valorPassagem;
    private EmpresasAereas nomeEmpresa;

    public Viagens(Calendar dataViagem, int quantidadePontosGerados, double valorPassagem, EmpresasAereas nomeEmpresa) {
        this.dataViagem = dataViagem;
        this.quantidadePontosGerados = quantidadePontosGerados;
        this.valorPassagem = valorPassagem;
        this.nomeEmpresa = nomeEmpresa;
    }

    public Calendar getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Calendar dataViagem) {
        this.dataViagem = dataViagem;
    }

    public int getQuantidadePontosGerados() {
        return quantidadePontosGerados;
    }

    public void setQuantidadePontosGerados(int quantidadePontosGerados) {
        this.quantidadePontosGerados = quantidadePontosGerados;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public EmpresasAereas getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(EmpresasAereas nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
