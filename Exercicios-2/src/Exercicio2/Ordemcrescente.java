package Exercicio2;

import java.util.Scanner;

public class Ordemcrescente {

	public static void main(String[] args) {
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior
		
				int a,b,c,maior=0,menor=0,meio=0;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite o valor A:");
				a = leia.nextInt();
				System.out.println("Digite o valor B:");
				b = leia.nextInt();
				System.out.println("Digite o valor C:");
				c = leia.nextInt();
				
				//Encontrar Menor Número
				if(a<b && a<c)
			        menor = a;
			    else if(b<a && b<c)
			        menor = b;
			    else if(c<a && c<b)
			        menor = c;
				
				//Encontrar Maior número
			    if(a>b && a>c)
			        maior = a;
			    else if(b>a && b>c)
			        maior = b;
			    else if(c>a && c>b)
			        maior = c;
			  
			    //Encontrar o número do meio para realizar a ordem crescente
			    if(a>b && a<c) {
			    	meio =a;
			    }
			    else if(b>a && b<c) {
			    		meio =b;
			    	}
			    else if(c>a && c<b) {
			    			meio = c;
			    		}
			    System.out.println("Ordem Crescente:"+ menor +" "+ meio +" "+ maior);
			    //Nessa parte, após o usuário digitar os números, o sistema ira
			    //organizar por ordem crescente
	}
}
