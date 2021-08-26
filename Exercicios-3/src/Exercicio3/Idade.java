package Exercicio3;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args){
		
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
		
		int idade,x=0,y=0;
		
	
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		
		while(idade !=-99) {
			
		}
		if(idade>0 && idade<=21){
			x++;
		}
		else if(idade>=50){
			y++;
		}
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();

	    System.out.println("Total de pessoas com manos de 21 anos:"+x);
	    System.out.println("Total de pessoas com mais de 50 anos:"+y);
	}
}
