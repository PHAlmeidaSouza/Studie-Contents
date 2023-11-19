package entities;

public class Product {
	private String nomes;
	private double notas1Sem;
	private double notas2Sem;

	public Product(String nomes, double notas1Sem, double notas2Sem) {
		this.nomes = nomes;
		this.notas1Sem = notas1Sem;
		this.notas2Sem = notas2Sem;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public double getNotas1Sem() {
		return notas1Sem;
	}

	public void setNotas1Sem(double notas1Sem) {
		this.notas1Sem = notas1Sem;
	}

	public double getNotas2Sem() {
		return notas2Sem;
	}

	public void setNotas2Sem(double notas2Sem) {
		this.notas2Sem = notas2Sem;
	}

	public String toString() {
		return nomes;
	}
	
	
}
