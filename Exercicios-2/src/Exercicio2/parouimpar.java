package Exercicio2;

import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se 
		 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		int ParOuImpar;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu n�mero:");
		ParOuImpar = leia.nextInt();
		
		if(ParOuImpar % 2==0) {
			System.out.println("Seu n�mero � Par!!");
		}
		else{
			System.out.println("Seu n�mero � Impar!!");
		}
	}
}
