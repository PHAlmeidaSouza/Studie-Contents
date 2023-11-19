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
			System.out.print("Digite um número: ");
			int numeros = sc.nextInt();
			vect[i] = new Product(numeros);
		}

		System.out.println("Números pares: ");

		int quantidade = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumeros() % 2 == 0) {
				System.out.printf("%d  ", vect[i].getNumeros());
				quantidade++;
			}
		}

		System.out.println();
		System.out.println("Quantidade de pares: " + quantidade);

		sc.close();
	}

}
