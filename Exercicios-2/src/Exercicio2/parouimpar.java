package Exercicio2;

import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se 
		 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.
		 */
		
		int ParOuImpar;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu número:");
		ParOuImpar = leia.nextInt();
		
		if(ParOuImpar % 2==0) {
			System.out.println("Seu número é Par!!");
		}
		else{
			System.out.println("Seu número é Impar!!");
		}
	}
}
