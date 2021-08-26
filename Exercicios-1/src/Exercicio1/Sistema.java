package Exercicio1;

import java.util.Scanner;

public class Sistema {
	
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

	public static void main(String[] args) {
		
		int anos, meses,dias,resp_dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira sua idade:");
		anos = leia.nextInt();
		System.out.println("Insira sua idade:");
		meses = leia.nextInt();
		System.out.println("Insira sua idade:");
		dias = leia.nextInt();
		
		resp_dias = (dias+(anos*365)+(meses+30));
		
		System.out.println("Sua idade em dias é:"+resp_dias);
	}

}
