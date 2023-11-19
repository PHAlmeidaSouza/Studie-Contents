package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas:");
		int p = sc.nextInt();
		sc.nextLine();

		Product[] vect = new Product[p];

		for (int i = 0; i < p; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Product(name, idade, altura);
		}

		double a = 0;

		for (int i = 0; i < vect.length; i++) {
			a += vect[i].getAltura();
		}

		double altMedia = a / vect.length;

		System.out.printf("Altura Média: %.2f%n", altMedia);

		int nmenores = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				nmenores++;
			}
		}
		double percentualMenores = ((double) nmenores / p) * 100.0;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getNome());
			}
		}

		sc.close();
	}

}
