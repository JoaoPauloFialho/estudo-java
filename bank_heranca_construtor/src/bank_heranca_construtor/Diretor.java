package bank_heranca_construtor;

public class Diretor extends Funcionario implements Autenticavel{
	AutenticacaoUtil autenticador;
	
	public Diretor(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticaSenha(int senha) {
		return this.autenticador.autenticaSenha(senha);
	}
	public double getBonificacao() {
		return super.getSalario()*2;
	}
	
}
