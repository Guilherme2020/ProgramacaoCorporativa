package modelo;


import java.util.Calendar;
import java.util.Set;

public class Amigos {

    private Usuarios usuario;
    private boolean Status;
    private Calendar dataAmizade;
    private Set<Usuarios> amigosComum;

    public Amigos(Usuarios usuario, boolean status, Calendar data, Set<Usuarios> amigosComum) {
        this.usuario = usuario;
        this.Status = status;
        this.dataAmizade = data;
        this.amigosComum = amigosComum;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public Calendar getData() {
        return dataAmizade;
    }

    public void setData(Calendar data) {
        this.dataAmizade = data;
    }

    public Set<Usuarios> getAmigosComum() {
        return amigosComum;
    }

    public void setAmigosComum(Set<Usuarios> amigosComum) {
        this.amigosComum = amigosComum;
    }
}
