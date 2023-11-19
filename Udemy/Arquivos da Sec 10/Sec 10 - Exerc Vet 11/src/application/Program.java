package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %dª pessoa:\n", (i + 1));
			double alturas = sc.nextDouble();
			System.out.printf("Genêro da %dª pessoa:\n", (i + 1));
			char generos = sc.next().charAt(0);
			vect[i] = new Product(alturas, generos);
		}

		double menorAltura = vect[0].getAlturas();
		double maiorAltura = vect[0].getAlturas();

		for (int i = 1; i < vect.length; i++) {
			 if (vect[i].getAlturas() < menorAltura) {
	                menorAltura = vect[i].getAlturas();
	            } else if (vect[i].getAlturas() > maiorAltura) {
	                maiorAltura = vect[i].getAlturas();
	         }
		}

		int quantHomens = 0;
		int quantMulheres = 0;
		double alturaFemTotal = 0.0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGeneros() == 'M') {
				quantHomens++;
			} else {
				quantMulheres++;
				alturaFemTotal += vect[i].getAlturas();
			}
		}

		double alturaMediaFem = alturaFemTotal / quantMulheres;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMediaFem);
		System.out.printf("Numero de homens = %d\n", quantHomens);

		sc.close();
	}

}
