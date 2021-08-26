package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;//opção do usuario a digitar
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n(1) Deseja adicionar produtos ao estoque\n"+
		"(2) Deseja remover um produto? \n(3) Atualizar\n(4) Mostrar todo os produto do estoque"
		+"\n(0) Encerrar o programa");
			System.out.println("\n---------------------------------");
			System.out.println("\n\tDigite sua opção: ");
			System.out.println("\n---------------------------------");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();//Limpar buf de memoria
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();//Vou ler uma variavel do tipo String
				estoque.add(produto);//Adicionar um produto no meu ArrayList
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)){//Precisa saber se o produto está no estoque
					estoque.remove(produto1);//Remove o produto solicitado
				}
				else {
					System.out.println("\nProduto não existe no estoque: ");//Se não tiver o produto em estoque
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+ " : ");//Qual vai tirar
				String novo = leia.nextLine();//Qual vai adicionar
				
				if(estoque.contains(verifica)) {//Vai verificar se este produto está em estoque
					estoque.remove(verifica);//Caso tenha será removido
					estoque.add(novo);//E adicionado um novo
				}
				else {
					System.out.println("\nProduto não existente");
				}
				System.out.println(estoque);//Verificar se realmente atualizou
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);//Mostrar o estoque
				break;
				default:
					System.out.println("\nFinalizou o programa, volte sempre!!!");
			}
		}
		while(op != 0);//Quando for diferente de 0
	}

}
