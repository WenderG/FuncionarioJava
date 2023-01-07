
public class CartaoDeAcessoUtil {
	private String codigoDeAcesso;

    public void setCodigoDeAcesso(String codigoDeAcesso) {
        this.codigoDeAcesso = codigoDeAcesso;
    }

    public boolean autentica(String codigoDeAcesso) {
        if(this.codigoDeAcesso == codigoDeAcesso) {
            return true;
        } else {
            return false;
        }
    }
}
	