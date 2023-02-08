package conta;

public class Conta {
	private double saldo;
	int agencia;
	private int numero;
	Cliente titular;

	// esse atributo é da classe então todas as referências vão apontar para esse
	// atributo que é o mesmo
	private static int totalDeContas;

	// a classe pode ter mais de 1 construtor, para que ele aceite menos ou mais
	// parâmetros conforme a nescessidade
	// no caso desse cosntrutor caso você crie uma conta e passe só 1 parâmetro int
	// ele vai salvar esse parametro como o numero
	// e a agencia vai ficar 1234 automaticamente

	public Conta(int agencia, int numero) {

		// como total é um atributo da classe você não acessa com this pois ela não é só
		// daquela classe que você tá trabalhando
		// ela é de todas as classes, então sempre que esse construtor for invocado, ou
		// seja, sempre que você criar uma Conta nova
		// o total vai ser modificado em mais 1

		// dentro de um construtor obviamente você consegue fazer validações utilizando
		// if
		if (numero > 0) {
			this.numero = numero;
		} else {
			System.out.println("Numero de conta invalido");
		}

		this.agencia = agencia;
		Conta.totalDeContas++;
	}

	public Conta(int numero) {
		// para poupar repetição de código e não precisa ficar criando vários
		// construtores, você pode criar uma construtor maior que abrange tudo
		// e os construtores menores você utiliza o this na construção, esse this você
		// tá basicamente chamando o construtor maior
		this(1234, numero);
	}

	// como o totalDeContas é um atributo static o getter dele precisa também ser
	// static pois ela é um atributo da classe, se você não faz
	// um getter static basicamente esse gette não static só vai poder ser chamado
	// se você especificar uma conta, por exemplo conta1.getTotaldeContas(),
	// porém isso não é muito interessante, como total é uma variável, como total
	// é uma variável da classe é interessante que você possa chamar diretamente
	// usando a classe
	// tipo Conta.getTotalDeContas() por isso esse método é static, obviamente você
	// ainda pode chamar
	// conta1.getTotalDeContas() pois é um método da classe

	public static int getTotalDeContas() {

		// dentro de um método static você não consegue chamar atributos da classe não
		// estáticos
		// this.agencia por exemplo n pode ser chamado
		return Conta.totalDeContas;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		
		if (valor > this.saldo) {
			return false;
		}
		this.saldo -= valor;
		
		return true;
	}

	public boolean transfere(double valor, Conta conta) {
		
		if (valor < this.saldo) {
			conta.deposita(valor);
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
}