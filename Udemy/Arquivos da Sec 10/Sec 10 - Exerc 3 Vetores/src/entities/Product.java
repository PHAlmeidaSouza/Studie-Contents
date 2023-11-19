package entities;

public class Product {
	
	private String name;
	private int idade;
	private double altura;
	
	public Product(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
