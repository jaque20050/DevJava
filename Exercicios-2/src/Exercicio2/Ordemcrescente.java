package Exercicio2;

import java.util.Scanner;

public class Ordemcrescente {

	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
		
				int a,b,c,maior=0,menor=0,meio=0;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite o valor A:");
				a = leia.nextInt();
				System.out.println("Digite o valor B:");
				b = leia.nextInt();
				System.out.println("Digite o valor C:");
				c = leia.nextInt();
				
				//Encontrar Menor N�mero
				if(a<b && a<c)
			        menor = a;
			    else if(b<a && b<c)
			        menor = b;
			    else if(c<a && c<b)
			        menor = c;
				
				//Encontrar Maior n�mero
			    if(a>b && a>c)
			        maior = a;
			    else if(b>a && b>c)
			        maior = b;
			    else if(c>a && c>b)
			        maior = c;
			  
			    //Encontrar o n�mero do meio para realizar a ordem crescente
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
			    //Nessa parte, ap�s o usu�rio digitar os n�meros, o sistema ira
			    //organizar por ordem crescente
	}
}
