package entities;

public class Product {
	public String nome; 
	public int conta;
	public double valorInicial;
	
	public Product(String nome, int conta, double valorInicial) {
		this.nome = nome;
		this.conta = conta;
		this.valorInicial = valorInicial;
	}
	public Product(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	
}
