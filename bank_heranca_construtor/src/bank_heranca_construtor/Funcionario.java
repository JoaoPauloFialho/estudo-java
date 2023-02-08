package bank_heranca_construtor;

// a classe abstrata funciona como um molde para outras, basicamente não é possível instância-la
public abstract class Funcionario {

	// eu coloquei os atributos como protected pois assim eles vão ser "privados"
	// normalmente, por exemplo, na main eu não vou pode-los
	// modificar livremente porém as classes filhas dessa classe poderão acessa-los
	// livremente
	// publico para os filhos para o resto privado

	protected String nome;
	protected String cpf;
	protected double salario;

	// era possível deixar private tbm, aí quando fosse pra chamar o atributo na
	// classe filha você usava um super.getOqueVocêQuerPegar, aí tudo vai ficar
	// privado

	
	// esse método é abstrato então obrigatoriamente os elementos filhos precisam de
	// um método que sobrescreva esse

	public abstract double getBonificacao();

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
