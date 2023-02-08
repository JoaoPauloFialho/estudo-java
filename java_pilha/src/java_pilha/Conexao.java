package java_pilha;

public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() throws IllegalStateException{
        System.out.println("Recebendo dados");
            throw new IllegalStateException();
    }
    
    @Override
    public void close() {
    	System.out.println("Fechando conexao");
    }
}