package Exercicio4;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		int [] a = {1, 0, 5, -2, -5, 7};
        int somaValores=0,x,atribuicao=100;

        Scanner leia = new Scanner(System.in);

        for (x=0;x<6;x++)
        {
            somaValores = a[0] + a[1] + a[5];
            a[4] = 100;
        }
        System.out.println("\n A soma dos três primeiros vetroes é: "+somaValores); //8
        System.out.println("\n 0 = "+a[0]); //1
        System.out.println("\n 1 = "+a[1]); //0
        System.out.println("\n 2 = "+a[2]); //5
        System.out.println("\n 3 = "+a[3]); //-2
        System.out.println("\n 4 = "+a[4]); //95
        System.out.println("\n 5 = "+a[5]); //7
    }

}
