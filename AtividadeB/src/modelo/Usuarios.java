package modelo;


public class Usuarios {

    private Perfil perfil;
    private String email;
    private int numeroConfirmacao;
    private String nome;
    private String senha;

    public Usuarios(Perfil perfil, String email, int numeroConfirmacao, String nome,String senha) {
        this.perfil = perfil;
        this.email = email;
        this.numeroConfirmacao = numeroConfirmacao;
        this.nome = nome;
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroConfirmacao() {
        return numeroConfirmacao;
    }

    public void setNumeroConfirmacao(int numeroConfirmacao) {
        this.numeroConfirmacao = numeroConfirmacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getSenha(){return senha;}

    public void setSenha(String senha){this.senha = senha;}

}
