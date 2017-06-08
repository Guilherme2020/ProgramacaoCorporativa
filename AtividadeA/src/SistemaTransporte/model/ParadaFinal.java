package SistemaTransporte.model;


import java.util.ArrayList;

public class ParadaFinal {
    private ArrayList<Funcionarios> fiscal;
    private String local;
    private ArrayList<EscalaHorario> escalaHorario;


    public ParadaFinal(ArrayList<Funcionarios> fiscal, String local, ArrayList<EscalaHorario> escalaHorario) {
        this.fiscal = fiscal;
        this.local = local;
        this.escalaHorario = escalaHorario;
    }

    public void setFiscal(ArrayList<Funcionarios> fiscal) {
        this.fiscal = fiscal;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setEscalaHorario(ArrayList<EscalaHorario> escalaHorario) {
        this.escalaHorario = escalaHorario;
    }

    public ArrayList<Funcionarios> getFiscal() {

        return fiscal;
    }

    public String getLocal() {
        return local;
    }

    public ArrayList<EscalaHorario> getEscalaHorario() {
        return escalaHorario;
    }
}
