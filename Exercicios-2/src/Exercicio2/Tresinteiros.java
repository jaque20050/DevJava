package Exercicio2;

import java.util.Scanner;

public class Tresinteiros {

	public static void main(String[] args) {
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
		
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
		if((a < b) && /*E*/ (a < c))// vai comparar se A < B,C quando o usu�rio digitar
	        menor = a;

	    else if((b < a)&& /*E*/ (b < c))// vai comparar se B < A,C quando o usu�rio digitar
	        menor = b;

	    else if((c < a)&& /*E*/ (c < b))// vai comparar se C < A,B quando o usu�rio digitar
	        menor = c;
		
		//Encontrando Maior

	    if((a > b) && /*E*/  (a > c))// vai comparar se A > A,C quando o usu�rio digitar
	        maior = a;

	    else if((b > a)&& /*E*/ (b > c))// vai comparar se B > A,C quando o usu�rio digitar
	        maior = b;

	    else if((c > a)&& /*E*/  (c > b))// vai comparar se C > A,C quando o usu�rio digitar
	        maior = c;
	    
	    System.out.println("Maior:" + maior + " Menor:" + menor); // Ap�s compara��o
	    //o sistema me mostra qual o maior e o menor n�mero digitado pelo �suario

	}

}
