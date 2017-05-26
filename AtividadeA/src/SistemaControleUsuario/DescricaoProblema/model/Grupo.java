package SistemaControleUsuario.DescricaoProblema.model;

import java.util.ArrayList;


public class Grupo {

    private String nome;
    private ArrayList<Usuarios> usuarios;


    public Grupo(String nome, ArrayList<Usuarios> usuarios) {
        this.nome = nome;
        this.usuarios = usuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
}

