package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar?");
		int a = sc.nextInt();

		double[] vect = new double[a];

		for (int i = 0; i < a; i++) {
			sc.nextLine();
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("Valores = ");

		for (int i = 0; i < a; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}

		double soma = 0.0;
		for (int i = 0; i < a; i++) {
			soma += vect[i];
		}

		double media = soma / a;

		System.out.printf("\nSOMA = %.2f\n", soma);

		System.out.printf("\nSOMA = %.2f\n", media);

		sc.close();
	}

}
