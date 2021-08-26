package Exercicio2;

import java.util.Scanner;

public class Tresinteiros {

	public static void main(String[] args) {
//Faça um programa que receba três inteiros e diga qual deles é o maior
		
		int a,b,c,maior=0,menor=0;//Declarando variavel
		
		Scanner leia = new Scanner(System.in);//System.in = sistema de entrada//new = novo objeto
		//Scanner = pega oque o usuario digitar
		
		System.out.println("Digite o valor A:");
		a = leia.nextInt();//nextFloat = metodo para pegar o tipo float
		System.out.println("Digite o valor B:");
		b = leia.nextInt();
		System.out.println("Digite o valor C:");
		c = leia.nextInt();
		
		
		//Encontrando Menor
		if((a < b) && /*E*/ (a < c))// vai comparar se A < B,C quando o usuário digitar
	        menor = a;

	    else if((b < a)&& /*E*/ (b < c))// vai comparar se B < A,C quando o usuário digitar
	        menor = b;

	    else if((c < a)&& /*E*/ (c < b))// vai comparar se C < A,B quando o usuário digitar
	        menor = c;
		
		//Encontrando Maior

	    if((a > b) && /*E*/  (a > c))// vai comparar se A > A,C quando o usuário digitar
	        maior = a;

	    else if((b > a)&& /*E*/ (b > c))// vai comparar se B > A,C quando o usuário digitar
	        maior = b;

	    else if((c > a)&& /*E*/  (c > b))// vai comparar se C > A,C quando o usuário digitar
	        maior = c;
	    
	    System.out.println("Maior:" + maior + " Menor:" + menor); // Após comparação
	    //o sistema me mostra qual o maior e o menor número digitado pelo úsuario

	}

}
