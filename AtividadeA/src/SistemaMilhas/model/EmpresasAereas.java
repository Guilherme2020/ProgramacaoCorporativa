package SistemaMilhas.model;


public class EmpresasAereas {

    private String nome;
    private String recompensasOfertadas;

    public EmpresasAereas(String nome, String recompensasOfertadas) {
        this.nome = nome;
        this.recompensasOfertadas = recompensasOfertadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRecompensasOfertadas() {
        return recompensasOfertadas;
    }

    public void setRecompensasOfertadas(String recompensasOfertadas) {
        this.recompensasOfertadas = recompensasOfertadas;
    }
}
