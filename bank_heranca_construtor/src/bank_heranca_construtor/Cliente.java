package bank_heranca_construtor;

//como eu quero pegar os métodos de uma interface eu n uso o extends que serve pra herdar de classe eu uso o implements pq eu quero implementar a
//interface

//é possível implementar diversas interfaces

public class Cliente implements Autenticavel {
	//criei essa classe aqui para delegar a funcionalidade de autenticação para ela
	//isso aqui de uma classe estar na composição de outra é composição
	AutenticacaoUtil autenticador;
	
	public Cliente(){
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
}
