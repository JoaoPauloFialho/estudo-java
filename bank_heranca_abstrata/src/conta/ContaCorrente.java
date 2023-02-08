package conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficiente{
		super.saca(valor + 0.20);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
