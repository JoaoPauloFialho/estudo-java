package bank_heranca_construtor;

//a interface é como se fosse um contrato, as classes que "assinam" esse 
//contrato são obrigador a ter todos os seus métodos pois todos são abstratos

public abstract interface Autenticavel {

	public void setSenha(int senha);

	public boolean autenticaSenha(int senha);

}
