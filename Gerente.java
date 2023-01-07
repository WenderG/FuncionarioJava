
public class Gerente extends Funcionario implements CartaoDeAcesso {
	private CartaoDeAcessoUtil autenticador;

    public Gerente() {
        this.autenticador = new CartaoDeAcessoUtil();
    }
    
    @Override
    public void setCodigoDeAcesso(String codigoDeAcesso) {
        this.autenticador.setCodigoDeAcesso(codigoDeAcesso);
    }

    @Override
    public boolean autentica(String codigoDeAcesso) {
        return this.autenticador.autentica(codigoDeAcesso);
    }

}
