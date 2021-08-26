package Loja;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoquePriscila {

	public static void main(String[] args) {
		//Armazenda dado,Remover,Atualizar,Apresentar
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		do {
			System.out.println("\n**************QUITANDA DA PRISCILA**********************");
			System.out.println("\n(1) Armazenar no Estoque da Priscila\n"+
		"(2) Remover \n(3) Atualizar\n(4) Oque está no estoque"
		+"\n(5) Encerrar o programa");
			System.out.println("\n---------------------------------");
			System.out.println("\n\tDigite sua opção: ");
			System.out.println("\n---------------------------------");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nAdicionar no Armazem: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nRemover do Estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)){
					estoque.remove(produto1);
				}
				else {
					System.out.println("\nProduto não existe no estoque da Quitanda: ");//Se não tiver o produto em estoque
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nQual produto a ser atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+ " : ");//Qual vai tirar
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);//
				}
				else {
					System.out.println("\nProduto não existente");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou sua compra, TCHAU!!!");
			}
		}
		while(op != 5);
	}

}
