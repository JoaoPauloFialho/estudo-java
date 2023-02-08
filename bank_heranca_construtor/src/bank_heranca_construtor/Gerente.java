package bank_heranca_construtor;


//eu consigo herdar de uma classe e implementar uma interface tranquilamente

public class Gerente extends Funcionario implements Autenticavel{
	
	AutenticacaoUtil autenticador;
	
	public Gerente(){
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
		
		//como esse salario é atributo da classe mãe para deixar explícito ele não recebe o this. antes e sim o super.
		//super basicamente indica que você deve olhar a classe mais acima na hierarquia
		
		return super.salario;
		
		//como deu pra ver é possível também evocar o método da classe mãe utilizando o super. , numa classe filha é possível utilizar métodos
		//da classe mãe basicamente
		//tem que ter cuidado para não utilizar o this. senão vai chamar o método dessa própria classe e vai acabar gerando umma recursão
	}	
}
