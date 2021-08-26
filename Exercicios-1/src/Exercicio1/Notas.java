package Exercicio1;

import java.util.Scanner;

public class Notas {
	
	//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Entre com a primeira nota:");
		nota1 = leia.nextFloat();
	    System.out.println("Entre com a segunda nota:");
	    nota2 = leia.nextFloat();
	    System.out.println("Entre com a terceira nota:");
	    nota3 = leia.nextFloat();
	    
	    media = (nota1+nota2+nota3)/3;
	    
	    if(media>=7 || media<10) {
	    System.out.println("Aluno Aprovado!!!");
	    }else {
	    	System.out.println("Aluno Reprovado!!!");
	    }

	}

}
