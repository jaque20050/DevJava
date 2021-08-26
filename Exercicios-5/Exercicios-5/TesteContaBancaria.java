package Exercicios5;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb01 = new ContaBancaria("Jaqueline Camilo Das","Rua Zeca,95","123.345.789.99","34.789.005-8");
		
		cb01.imprimirInfo();
		System.out.println("Seu dados cadastrado");
		
		cb01.setEndereco("Rua Marsellha,12");
		cb01.imprimirInfo();

	}

}
