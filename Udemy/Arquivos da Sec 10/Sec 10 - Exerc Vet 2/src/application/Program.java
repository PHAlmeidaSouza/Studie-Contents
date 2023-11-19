package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			int numeros = sc.nextInt();
			vect[i] = new Product(numeros);
		}

		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%d  ", vect[i].getNumeros());
		}
		System.out.println();

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getNumeros();
		}

		double media = sum / n;

		System.out.printf("Soma = %.2f\n", sum);
		System.out.printf("Média = %.2f\n", media);

		sc.close();
	}

}
