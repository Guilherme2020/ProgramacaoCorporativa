package modelo;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class Perfil {
    private String fotoPerfil;
    private List<Post> status;
    private Calendar dataAniversario;
    private Set<String> fotosPreferidas;
    private Set<Amigos>  solicitacoesAmizade;
    private List<Grupo> grupos;
    private String descricao;
    private Set<Post> posts;
    private Set<Curtida> curtidas;
    private List<Paginas> paginas;
    private List<Amigos> amigos;
    private List<RegistroAtividade> atividades;

    public Perfil(String fotoPerfil, List<Post> status, Calendar dataAniversario, Set<String> fotosPreferidas, Set<Amigos> solicitacoesAmizade, List<Grupo> grupos, String descricao, Set<Post> posts, Set<Curtida> curtidas, List<Paginas> paginas, List<Amigos> amigos, List<RegistroAtividade> atividades) {
        this.fotoPerfil = fotoPerfil;
        this.status = status;
        this.dataAniversario = dataAniversario;
        this.fotosPreferidas = fotosPreferidas;
        this.solicitacoesAmizade = solicitacoesAmizade;
        this.grupos = grupos;
        this.descricao = descricao;
        this.posts = posts;

        this.curtidas = curtidas;
        this.paginas = paginas;
        this.amigos = amigos;
        this.atividades = atividades;
    }

    public String getFoto() {
        return fotoPerfil;
    }

    public void setFoto(String foto) {
        this.fotoPerfil = foto;
    }

    public Set<String> getFotoPreferida() {return fotosPreferidas;}

    public Set<Amigos> getSolicitacoesAmizade() {
        return solicitacoesAmizade;
    }

    public void setSolicitacoesAmizade(Set<Amigos> solicitacoesAmizade) {
        this.solicitacoesAmizade = solicitacoesAmizade;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Set<Curtida> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Set<Curtida> curtidas) {
        this.curtidas = curtidas;
    }

    public List<Post> getStatus() {
        return status;
    }

    public void setStatus(List<Post> status) {
        this.status = status;
    }

    public Calendar getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Calendar dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public List<Paginas> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Paginas> paginas) {
        this.paginas = paginas;
    }

    public List<Amigos> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigos> amigos) {
        this.amigos = amigos;
    }

    public List<RegistroAtividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<RegistroAtividade> atividades) {
        this.atividades = atividades;
    }
}
