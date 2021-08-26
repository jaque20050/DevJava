package Exercicio3;

import java.util.Scanner;

public class ParesImpares {
	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. 

	public static void main(String[] args) {
		
		int num,impar=0,par=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		num = leia.nextInt();
		
		for(x=0;x<=10;x++);{
			
			if(num % 2==0) 
				par++;
			
			else
				impar++;
			}
		System.out.println("Quantidade de Par:"+par);
		System.out.println("Quantidade de Impar:"+impar);
	}
}