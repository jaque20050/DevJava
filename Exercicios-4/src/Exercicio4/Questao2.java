package Exercicio4;

import java.util.Scanner;

public class Questao2 {
	
	/*Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.*/


	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int somapar=0,impardig=0,paresdig=0,contimpar=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {//quantidade de loop
			
			System.out.println("Digite um número:");
			numeros[x] = leia.nextInt();//Armazena o número
		
			if(numeros[x] %2 ==0){//Vai calcular para saber se e par, se não impar
				somapar = somapar + numeros[x];
				System.out.println("Esse número e Par:" +numeros[x]);//Vai mostra o número
			}
			else {
				contimpar++;//Vai contar cada vezes que for par
				System.out.println("Esse número e Par:" +numeros[x]);
			}
			
		}
			
			System.out.println("A quantidade de números ímpares digitados:"+contimpar);
			System.out.println("Soma de Pares:" +somapar);
		}
	}
