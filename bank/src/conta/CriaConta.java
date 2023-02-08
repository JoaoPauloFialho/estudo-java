package conta;

public class CriaConta {
	public static void main(String[] args) {
		//quando um objeto é instânciado todos os seus atributos são zerados
		Conta primeiraConta = new Conta(1234, 1);
		Conta segundaConta = new Conta(1234,2);
		Cliente primeiroCliente = new Cliente();
		primeiraConta.titular = primeiroCliente;
		primeiroCliente.setNome("João");
		primeiraConta.deposita(230);
		segundaConta.deposita(300);
		primeiraConta.transfere(100, segundaConta);
		
		
		//como o atributo totalDeContas é de todas as contas eu posso chamar ele direto da classe Conta, mas também obviamente eu podia
		//chamar ele como primeiraConta.totalDeContas daria literalmente na mesma coisa
		System.out.println(Conta.getTotalDeContas());
		
		System.out.println("Saldo da primeira conta -> " + primeiraConta.getSaldo());
		
		
		//lembrar que esse new não faz com que o segundaConta seja um objeto do tipo conta
		//ele faz o segundaConta apontar para um objeto do tipo conta
		//tanto que se você criar uma Conta terceiraConta = segundaConta o terceira conta não
		//vai ser um objeto vai ser uma referência igual a referência segundaConta, então os 2
		//irão apontar para o msm objeto
		//os 2 terão como valor um endereço de memória iguais
		// os atributos dela serão iguais segundaConta.saldo == terceiraConta.saldo
		// e se você modificar o saldo em um vai modificar no objeto de referencia então vai modificar nos 2
		
		System.out.println("Saldo da segunda conta -> " + segundaConta.getSaldo());
		
		System.out.println("Nome ->" + primeiraConta.titular.getNome());
	}
}
