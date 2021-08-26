package Exercicio2;

import java.util.Scanner;

public class categoria {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		 * categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulo*/
		
		int idade;//Varial = idade do participante
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá atleta, quantos anos você tem?");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {//Irá comparar a idade inserida para a categoria
			System.out.println("Atleta, você está classificado na categoria INFANTL A");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Atleta, você está classificado na categoria JUVENIL A");
		}
		else if(idade>=18) {
			System.out.println("Atleta, você está classificado na categoria ADULTO");
		}
		else {
			System.out.println("Atleta, você ainda não pode competir,somente maiores de 10 anos");
		}
	}

}
