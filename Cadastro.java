
public class Cadastro{

	public static void main(String[] args) {
		
		Gerente sarah = new Gerente();
		
		sarah.setNome("Sarah Silva");
		sarah.setCpf("777.777.777-77");
		sarah.setSalario(5000.);
		
		sarah.setCodigoDeAcesso("A1A1B");
		boolean autenticou = sarah.autentica("A1A1B");
		
		System.out.println("Gerente: " + autenticou);
		System.out.printf("Nome: %s", sarah.getNome());
		System.out.println();
		System.out.printf("CPF: %s", sarah.getCpf());
		System.out.println();
		System.out.printf("Salário: R$%.2f", sarah.getSalario());
		System.out.println();
		
		System.out.println();
		
		Funcionario thiago = new Funcionario();
		
		thiago.setNome("Thiago Wender Gonsales");
		thiago.setCpf("999.999.999-99");
		thiago.setSalario(2000.50);
		
		System.out.printf("Nome: %s", thiago.getNome());
		System.out.println();
		System.out.printf("CPF: %s", thiago.getCpf());
		System.out.println();
		System.out.printf("Salário: R$%.2f", thiago.getSalario());
		System.out.println();
		
		System.out.println();
		
		Cliente vanessa = new Cliente();
		
		vanessa.setNome("Vanessa Andrade de Souza");
		vanessa.setCpf("888.888.888-88");
		vanessa.setFatura(250);
		
		System.out.printf("Cliente: %s", vanessa.getNome());
		System.out.println();
		System.out.printf("CPF: %s", vanessa.getCpf());
		System.out.println();
		System.out.printf("Fatura: R$%.2f", vanessa.getFatura());
		System.out.println();
		
	}

}
