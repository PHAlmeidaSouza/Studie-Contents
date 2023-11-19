package entities;

public class Product {
	private double alturas;
	private char generos;

	public Product(double alturas, char generos) {
		this.alturas = alturas;
		this.generos = generos;
	}

	public double getAlturas() {
		return alturas;
	}

	public void setAlturas(double alturas) {
		this.alturas = alturas;
	}

	public char getGeneros() {
		return generos;
	}

	public void setGeneros(char generos) {
		this.generos = generos;
	}

}
