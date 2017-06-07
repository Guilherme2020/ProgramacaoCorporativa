package modelo;


import java.util.ArrayList;


public class Curtida {

    private ArrayList<Post> curtidas;
    private String tipo;


    public Curtida(ArrayList<Post> curtidas, String tipo) {
        this.curtidas = curtidas;
        this.tipo = tipo;
    }

    public ArrayList<Post> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(ArrayList<Post> curtidas) {
        this.curtidas = curtidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
