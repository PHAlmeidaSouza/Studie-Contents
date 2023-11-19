package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar");
		int quantidade = sc.nextInt();
		sc.nextLine();

		Product[] vect = new Product[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite um número: ");
			int numeros = sc.nextInt();
			vect[i] = new Product(numeros);
		}
		
		int resultado = 0;
		for (int i = 0; i < quantidade; i++) {
		    if (vect[i].getNumeros() % 2 == 0) {
		    	sc.nextLine();
		        System.out.printf("%d ", vect[i].getNumeros());
		        resultado++;
		    }
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", resultado);

		sc.close();
	}

}
