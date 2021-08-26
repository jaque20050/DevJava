package Exercicio4;

import java.util.Scanner;

public class LeiaMatriz {

	public static void main(String[] args) {
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
	  int [][] numeros = new int[3][3];
	  int l,c=0,conte=0;
	  
	  Scanner leia = new Scanner(System.in);
	  
	  for(l=0;l<3;l++) {
		  
		  for(c=0;c<3;c++) {
			  System.out.println("Insira o número:");
			  numeros[l][c] = leia.nextInt();
			  
			  if(numeros[l][c] > 10){
				  conte++;
			  }
		  }
	  }
	  System.out.println("Esse números são maiores que 10:" +conte);
	}
}
