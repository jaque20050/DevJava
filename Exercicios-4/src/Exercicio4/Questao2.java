package Exercicio4;

import java.util.Scanner;

public class Questao2 {
	
	/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.*/


	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int somapar=0,impardig=0,paresdig=0,contimpar=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {//quantidade de loop
			
			System.out.println("Digite um n�mero:");
			numeros[x] = leia.nextInt();//Armazena o n�mero
		
			if(numeros[x] %2 ==0){//Vai calcular para saber se e par, se n�o impar
				somapar = somapar + numeros[x];
				System.out.println("Esse n�mero e Par:" +numeros[x]);//Vai mostra o n�mero
			}
			else {
				contimpar++;//Vai contar cada vezes que for par
				System.out.println("Esse n�mero e Par:" +numeros[x]);
			}
			
		}
			
			System.out.println("A quantidade de n�meros �mpares digitados:"+contimpar);
			System.out.println("Soma de Pares:" +somapar);
		}
	}
