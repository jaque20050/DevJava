package Lista;

public class Excecao {

	public static void main(String[] args) {
		
		String frase = null,novaFrase=null;//Duas variaveis nulas
		
		try {//Estratura que verifica se h� possibilidade de erro
			novaFrase = frase.toUpperCase();//Letra Maiuscula
		}
		catch(NullPointerException e){//captura da possivel exce��o//Manipula��o em dado que n�o existe
			//tratamento da exce��o
			System.out.println("\nA frase inicial est� nula, para solucionar tal problema, foi atribuido um valor defaul....");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nFrase nova: "+novaFrase);
	}

}
