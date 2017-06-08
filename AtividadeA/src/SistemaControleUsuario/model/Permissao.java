package SistemaControleUsuario.model;


public class Permissao {
    private int nivelPermissao;

    public Permissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    public int getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
}
