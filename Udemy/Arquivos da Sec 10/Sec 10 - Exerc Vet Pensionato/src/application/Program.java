package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		Product[] vect = new Product[10];

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nomes = sc.nextLine();
			System.out.print("Email: ");
			String emails = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[room] = new Product(nomes, emails);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}

		sc.close();
	}
}
