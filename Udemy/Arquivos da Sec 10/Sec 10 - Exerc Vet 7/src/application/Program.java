package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
*/
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um valor: ");
			double numeros = sc.nextDouble();
			vect[i] = new Product(numeros);
		}

		double todosValores = 0.0;
		for (int i = 0; i < vect.length; i++) {
			todosValores += vect[i].getNumeros();
		}
		
		System.out.println();
		double media = todosValores / n;
		
		System.out.println("Média do Vetor: " + media);
		
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i<vect.length; i++) {
			if(vect[i].getNumeros() < media) {
				System.out.printf("%.1f\n", vect[i].getNumeros());
			}
		}

		sc.close();
	}

}
