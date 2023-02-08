package bank_heranca_construtor;

public class teste {
	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		
		Gerente g = new Gerente();
		g.setSenha(1234);
		
		Cliente c = new Cliente();
		
		c.setSenha(1234);
		
		si.autenticou(g);
		
		si.autenticou(c);
		
		
	}
}
