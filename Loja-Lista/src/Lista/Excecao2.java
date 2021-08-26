package Lista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	//Demostra o lan�amento de uma exce��o quando ocorre uma divis�o por 0

	public static int quociente(int numerador,int denominador)throws ArithmeticException {
		return numerador / denominador;
	}
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true;//determina se mais entradas s�o necess�ria
		
		do {
			try {//L� dois n�meros e calcular o quociente, fazendo a verifica��o 
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
				continueLoop = false;//Precisa indicar que ser� encerrado
			}
			catch(InputMismatchException inputMismatchException){//Entrou com dado diferente//Verifica um erro de tipo de dados diferentes
				System.err.printf("\nException: %s\n",inputMismatchException);//Tratar um erro
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com  um valor do tipo inteiro. Por favor tente novamente!!!");
			}
			catch(ArithmeticException arithmeticException) {//verifica��o de divis�o por 0
				System.err.printf("\nException: %s\n",arithmeticException);//Tratar o erro na divis�o por 0
				System.out.println("\nZero � um denominador inv�lido, Por favor digite novamente");
				
			}
		}
		while(continueLoop);
	}

}
