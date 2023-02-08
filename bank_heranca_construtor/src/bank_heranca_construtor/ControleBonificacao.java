package bank_heranca_construtor;

public class ControleBonificacao {

	private float totalBonificacao;

	// foi usado polimorfismo aqui, como eu tenho 2 tipos de funcionários especiais,
	// gerente e diretor e cada um tem uma bonificação única não
	// faria muito sentido eu fazer métodos específicos de registro com 3 tipos
	// diferentes (funcionarios, gerente e diretor), como gerente e diretor
	// herdam de funcionario eu posso referenciar esses tipos utilizando a classe
	// mãe que no caso é funcionário

	public void registra(Funcionario f) {
		this.totalBonificacao += f.getBonificacao();
	}

	// sendo assim no polimorfismo você pode referenciar uma classe filha utilizando
	// a classe mãe só que se você chamar um método que não tem
	// na classe mãe o programa não vai compilar, porém se existe esse método na
	// classe mãe ele compila. E assim como o exemplo anterior se existir
	// métodos de nomes iguais na classe mãe e na classe filha o método da classe
	// filha vai ser chamado pois ele é o mais específico

	public float getTotalBonificacao() {
		return this.totalBonificacao;
	}

}
