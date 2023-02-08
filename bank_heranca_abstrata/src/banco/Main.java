package banco;

import conta.*;

//java.lang.String
public class Main {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(100, 1);
		c1.deposita(300);
		
		ContaPoupanca c2 = new ContaPoupanca(100, 2);
		c2.deposita(400);
		
		try {
		c1.transfere(100, c2);
		}catch(Exception error) {
			System.out.println(error.getMessage());
		}
		try {			
			c1.saca(200);
		} catch(Exception error) {
			System.out.println(error.getMessage());
		}
		
		System.out.println("Conta corrente -> " + c1.getSaldo());
		System.out.println("Conta poupanca -> " + c2.getSaldo());
	}

}
