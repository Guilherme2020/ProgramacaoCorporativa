package modelo;


public class Curtida {

    private Post curtidas;
    private String tipo;


    public Curtida(Post curtidas, String tipo) {
        this.curtidas = curtidas;
        this.tipo = tipo;
    }

    public Post getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Post curtidas) {
        this.curtidas = curtidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
