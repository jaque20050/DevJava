package Exercicio1;

import java.util.Scanner;

public class Sistema2 {

	public static void main(String[] args) {
		
		int anos,meses,dias,resp_dias,resp_meses,resp_anos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira sua idade:");
		anos = leia.nextInt();
		System.out.println("Insira sua idade:");
		meses = leia.nextInt();
		System.out.println("Insira sua idade:");
		dias = leia.nextInt();
		
		resp_dias = (dias+(anos*365)+(meses*30));
		resp_anos = (anos*365);
		resp_meses =(anos*12);
		
		System.out.println("Sua idade em dias é:"+resp_dias);
		System.out.println("Sua idade em meses é:"+resp_meses);
		System.out.println("Sua idade em anos é:"+resp_anos);
	}
}
