package Exercicios5;

        //Minha Classe\\
public class ContaBancaria {
	//Crie uma classe conta bancaria e apresente os atributos e 
	//métodos referentes esta classe, em seguida crie um objeto conta 
	//bancaria, defina as instancias deste objeto e apresente as informações 
	//deste objeto no console.
	
	//Declaração dos Atributos da Classe
	
	
	//Atributos\\
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	
	//Metodo construtor\\
	public ContaBancaria(String nome,String endereco,String cpf,String rg) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
	}
	public void imprimirInfo() {
		System.out.println(nome + "\n\tseu endereco pode ser conta de água,luz e telefone :" +endereco+ 
				"\n\tseu CPF:" +cpf+ "\n\tseu RG pode ser CNH e RNE(Caso estrangeiro):" +rg);
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
