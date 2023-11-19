package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int numeros = sc.nextInt();
			vect[i] = new Product(numeros);
		}

		int npares = 0;
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumeros() % 2 == 0) {
				sum += vect[i].getNumeros();
				npares++;
			}
		}
		
		System.out.println();
		if (npares == 0) {
			System.out.println("Nenhum número par!");
		} else {
			System.out.println("Média dos Pares = " + sum);
		}
		sc.close();
	}

}
