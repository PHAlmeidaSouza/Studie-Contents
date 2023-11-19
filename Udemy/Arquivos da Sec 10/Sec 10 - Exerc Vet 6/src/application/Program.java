package application;

import java.util.Locale;
import java.util.Scanner;

import entities1.Vetor1;
import entities1.Vetor2;
import entities1.Vetor3;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter em cada vetor?");
		int n = sc.nextInt();

		Vetor1[] vect1 = new Vetor1[n];
		Vetor2[] vect2 = new Vetor2[n];
		Vetor3[] vect3 = new Vetor3[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vect1.length; i++) {
			int numeros1 = sc.nextInt();
			vect1[i] = new Vetor1(numeros1);
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vect2.length; i++) {
			int numeros2 = sc.nextInt();
			vect2[i] = new Vetor2(numeros2);
		}

		for (int i = 0; i < n; i++) {
			int soma = vect2[i].getNumeros() + vect1[i].getNumeros();
			vect3[i] = new Vetor3(soma);
		}

		System.out.println("Vetor resultante: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", vect3[i].getSoma());
		}

		sc.close();
	}

}
