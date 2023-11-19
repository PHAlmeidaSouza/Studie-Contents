package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			int numeros = sc.nextInt();
			vect[i] = new Product(numeros);

		}

		int posicao = 0;
		int maior = vect[0].getNumeros();

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumeros() > maior) {
				maior = vect[i].getNumeros();
				posicao = i;
			}
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + posicao);

		sc.close();
	}

}
