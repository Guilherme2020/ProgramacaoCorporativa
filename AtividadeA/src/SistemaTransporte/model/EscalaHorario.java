package SistemaTransporte.model;


import java.util.ArrayList;

public class EscalaHorario {
    private  int horario;
    private String data;
    private ArrayList<LinhaOnibus> nomeLinha;

    public EscalaHorario(int horario, String data, ArrayList<LinhaOnibus> nomeLinha) {
        this.horario = horario;
        this.data = data;
        this.nomeLinha = nomeLinha;
    }

    public int getHorario() {
        return horario;
    }

    public String getData() {
        return data;
    }

    public ArrayList<LinhaOnibus> getNomeLinha() {
        return nomeLinha;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNomeLinha(ArrayList<LinhaOnibus> nomeLinha) {
        this.nomeLinha = nomeLinha;
    }
}
