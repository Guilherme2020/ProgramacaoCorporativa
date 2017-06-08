package SistemaTransporteAereo.model;


public class SalaEmbarque {

    private String cartaoInformacao;

    public SalaEmbarque(String cartaoInformacao) {
        this.cartaoInformacao = cartaoInformacao;
    }

    public String getCartaoInformacao() {
        return cartaoInformacao;
    }

    public void setCartaoInformacao(String cartaoInformacao) {
        this.cartaoInformacao = cartaoInformacao;
    }
}
