package Exercicio1;

	import java.util.Scanner;

	public class Esquacao{

		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		
		public static void main(String[] args) {
			
			float a,b,c,d,e,f,x,y;
			
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("Entre com o A:");
			a = leitura.nextFloat();
			System.out.println("Entre com o B:");
			b = leitura.nextFloat();
			System.out.println("Entre com o C:");
			c = leitura.nextFloat();
			System.out.println("Entre com o D:");
			d = leitura.nextFloat();
			System.out.println("Entre com o E:");
			e = leitura.nextFloat();
			System.out.println("Entre com o F:");
			f = leitura.nextFloat();
			
			x = (c*e - b*f)/(a*e - b*d);
			y = (a*f - c*d)/(a*e - b*d);
			
			System.out.println("Valor de X:"+x);
			System.out.println("Valor de Y:"+y);
			System.out.printf("\nValor de X: %2.2f",x);
			System.out.printf("\nValor de Y: %2.2f",y);
		}

	}

