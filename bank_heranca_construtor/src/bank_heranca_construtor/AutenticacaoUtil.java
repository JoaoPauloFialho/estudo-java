package bank_heranca_construtor;

//eu criei essa classe aqui basicamente para reduzir repetição de código
public class AutenticacaoUtil {
	private int senha = 1234;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticaSenha(int senha) {
		if (this.senha == senha)
			return true;
		return false;
	}
}
