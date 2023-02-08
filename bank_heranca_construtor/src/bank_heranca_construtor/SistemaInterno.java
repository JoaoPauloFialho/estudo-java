package bank_heranca_construtor;

public class SistemaInterno {
	private int senha = 1234;
	
	//interface tem as mesmas vantagens do polimorfismo
	public void autenticou(Autenticavel f) {
		if(f.autenticaSenha(this.senha)) {
			System.out.println("Funcionario autenticou");
		}else {
			System.out.println("Funcionario nao autenticou");
		}
	}
	
}
