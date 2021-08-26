package Exercicios5;

public class Cliente {//Minha Classe
	//Crie uma classe cliente e apresente os atributos e métodos 
	//referentes esta classe, em seguida crie um objeto cliente, 
	//defina as instancias deste objeto e apresente as informações 
	//deste objeto no console.
	
	     //Atributos\\
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	
	      
	//Metodo construtor\\
	public Cliente(String nome ,String endereco, String cpf, String rg){
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg= rg;
	}
	public void imprimirInf() {
		System.out.println("Seu nome:" +nome+"\nSeu endereco:"+endereco+ "\nSeu CPF:" +cpf+ "\nSeu RG:" +rg);
	}
	    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
