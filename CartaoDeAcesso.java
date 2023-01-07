
public interface CartaoDeAcesso {
	public abstract void setCodigoDeAcesso(String codigoDeAcesso);
	public abstract boolean autentica(String codigoDeAcesso);
	
}
