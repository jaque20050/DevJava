package Exercicios5;

public class Aviao {
	//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações 
	//deste objeto no console.
	
	private String asas;
	private String comprimento;
	private int assentos;
	private int mascaras;
	private int pilotos;
	private int aeromocas;
	
	public Aviao(String asas,String comprimento,int assentos, int mascaras, int pilotos, int aeromocas ){
		
		this.asas = asas;
		this.comprimento = comprimento;
		this.assentos = assentos;
		this.mascaras = mascaras;
		this.pilotos = pilotos;
		this.aeromocas = aeromocas;
	}
	public void imprimirInfo() {
		System.out.println("\nAsas:"+asas + "\nComprimento:" +comprimento+ "\nQuantidade de assentos:" +assentos+ 
				"\nQuantidade de mascaras:" +mascaras+ "\nPilotos:" +pilotos+ "\nAeromoças:" +aeromocas);
	}
	public String getAsas() {
		return asas;
	}
	public void setAsas(String asas) {
		this.asas = asas;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public int getMascaras() {
		return mascaras;
	}
	public void setMascaras(int mascaras) {
		this.mascaras = mascaras;
	}
	public int getPilotos() {
		return pilotos;
	}
	public void setPilotos(int pilotos) {
		this.pilotos = pilotos;
	}
	public int getAeromocas() {
		return aeromocas;
	}
	public void setAeromocas(int aeromocas) {
		this.aeromocas = aeromocas;
	}
	
}
