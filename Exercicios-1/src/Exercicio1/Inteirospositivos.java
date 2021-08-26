package Exercicio1;

import java.util.Scanner;

public class Inteirospositivos {
	
	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
	
	public static void main(String[] args) {
	int a,b,c;
	float d,r,s;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Valor de A:");
	a = leia.nextInt();
	System.out.println("Valor de B:");
	b = leia.nextInt();
	System.out.println("Valor de C:");
	c = leia.nextInt();
	System.out.println("Valor de D:");
	d = leia.nextFloat();
	System.out.println("Valor de R:");
	r = leia.nextFloat();
	System.out.println("Valor de S:");
	s = leia.nextFloat();
	
	d = (r+s)/2;
	r = (a+b)*2;
	s = (b+c)*2;
	
	System.out.println("Resultado D:"+d);
	System.out.println("Resultado R:"+r);
	System.out.println("Resultado S:"+s);
			}
}

