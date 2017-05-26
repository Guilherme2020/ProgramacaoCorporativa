package SistemaTransporteAereo.model;




public class TorresControle {

    private int numeroFuncionarios;
    private int numeroVoosOperando;


    public TorresControle(int numeroFuncionarios, int numeroVoosOperando) {
        this.numeroFuncionarios = numeroFuncionarios;
        this.numeroVoosOperando = numeroVoosOperando;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroVoosOperando() {
        return numeroVoosOperando;
    }

    public void setNumeroVoosOperando(int numeroVoosOperando) {
        this.numeroVoosOperando = numeroVoosOperando;
    }
}
