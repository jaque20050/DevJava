package Exercicio1;

import java.util.Scanner;

public class ProgramaC {
	
	// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)
	//escreva a distância entre eles.  

	public static void main(String[] args) {
		
		double distancia,x1,y1,x2,y2;//Declarei minhas variaveis
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Primeiro Ponto:");
		x1 = leia.nextFloat();
		System.out.println("Segundo Ponto:");
		y1 = leia.nextFloat();
		System.out.println("Primeiro Ponto:");
		x2 = leia.nextFloat();
		System.out.println("Segundo Ponto:");
		y2 = leia.nextFloat();
		
		distancia = Math.sqrt(Math.pow((x2+x1),2)+ Math.pow((y2+y1),2));//Realizei o calculo entre os pontos usando raiz e 
		//potencia = SQRT = Raiz/ POW = POTENCIA
		System.out.printf("O Resultado é %2.2f",distancia);//Quero arredondar e printar em tela
	}

}
