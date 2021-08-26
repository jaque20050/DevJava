package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		//Estou criando um Colletions do tipo LIST e estou crinado um objeto minhaLista para inicar com o ArrayList
		
		List/*interface*/<Integer>/*inteiro arraylist*/minhaLista = new ArrayList<Integer>();/*Maniular minha list*/
		
		minhaLista.add(2);/*Adicionar um valor, dentro da minha lista, Ex = 2 e o valor n�o posi��o*/
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		
		for(Integer lista/*loop*/:minhaLista/*meu array*/) {
			System.out.println(lista);//Ir� imprimir os valores da minha lista
		}
		System.out.println("\nRemovendo um elemento da lista: ");//Remorer da lista
		
		minhaLista.remove(0);//Para ver se removeu da minha Lista
		
		for(Integer lista:minhaLista) {
			System.out.println(lista);
			//System.out.println(lista+lista1);//Caso queira que apare�a os dois tanto a quantidade quanto o  produto
		}
		int primeiroElemento = minhaLista.get(0);//Pega um elemento do Arraylist
		//Vai jogar dentro da minha variavel primeiroElemento
		System.out.println("\nO primeiro elemento �: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {//SIZE = Mostra o tamanho da ArrayList
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		Collections.sort(minhaLista);//O metodo sort vai ordenar a minhaLista
		System.out.println("\nDepois de ordenar....");
		System.out.println(minhaLista);
		System.out.println();
		
		Set/*n�o permiti elemento duplicado*/<Integer>meuSet = new HashSet<Integer>();//Estou criando o Set a partir do metodo HasSet
		
		meuSet.add(2);//Estou adicionando elemtentos para o meu HashSet
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(3);
		
		Iterator/*percorrer e remover duplicidade*/<Integer>iMeuSet = meuSet.iterator();/*Criar varias saida para manipular o Meuset*/
		//Estou criando uma nova interface chamado iterator
		while(iMeuSet.hasNext()) {//Percorrer toda meu collection da primeira  posi��o ate a ultima posi��o
			System.out.println(iMeuSet.next());//Vai mostrando a minha Lista de cada vez
           //vou imprimir cada posi��o indicando a proxima posi��o atraves do meu metodo NEXT
	}
}
}
