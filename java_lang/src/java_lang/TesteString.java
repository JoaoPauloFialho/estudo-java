package java_lang;

public class TesteString extends Object{
	public static void main(String[] args) {
		
		String nome = " Joao ";
		String replace = nome.replace("o", "a");
		String maiuscula = nome.toUpperCase();
		char charactereNaPosicao = nome.charAt(0);
		int indiceDoCaractere = nome.indexOf("J");
		String substring = nome.substring(0, 2);
		int tamanho = nome.length();
		boolean estaVazio = nome.isEmpty();
		String semEspacosLaterais = nome.trim();
		boolean contem = nome.contains("ao");
	
		
		System.out.print(nome);
		
		
		
	}
}
