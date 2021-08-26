package Lista;

public class Excecao {

	public static void main(String[] args) {
		
		String frase = null,novaFrase=null;//Duas variaveis nulas
		
		try {//Estratura que verifica se há possibilidade de erro
			novaFrase = frase.toUpperCase();//Letra Maiuscula
		}
		catch(NullPointerException e){//captura da possivel exceção//Manipulação em dado que não existe
			//tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema, foi atribuido um valor defaul....");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nFrase nova: "+novaFrase);
	}

}
