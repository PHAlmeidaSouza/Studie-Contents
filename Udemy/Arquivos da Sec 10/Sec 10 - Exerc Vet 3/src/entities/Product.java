package entities;

public class Product {
	
	private String nomes;
	private int idades;
	private double alturas;
	
	public Product(String nomes, int idades, double alturas) {
		this.nomes = nomes;
		this.idades = idades;
		this.alturas = alturas;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public int getIdades() {
		return idades;
	}

	public void setIdades(int idades) {
		this.idades = idades;
	}

	public double getAlturas() {
		return alturas;
	}

	public void setAlturas(double alturas) {
		this.alturas = alturas;
	}
	
}
