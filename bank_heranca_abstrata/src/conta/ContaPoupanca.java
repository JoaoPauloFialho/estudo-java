package conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		// esse super vai chamar o construtor da classe mãe, você precisa colocar os
		// parâmetros ali para especificar qual construto você quer chamar
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficiente{
		super.saca(valor);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
