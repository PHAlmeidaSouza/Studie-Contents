package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String nomes = sc.next();
			System.out.print("Idade: ");
			int idades = sc.nextInt();
			System.out.print("Altura: ");
			double alturas = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Product(nomes, idades, alturas);
		}

		double alt = 0.0;
		for (int i = 0; i < vect.length; i++) {
			alt += vect[i].getAlturas();
		}

		int numeroMenores = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdades() < 16) {
				numeroMenores++;
			}
		}

		double altMedia = alt / n;
		double percentualMenores = ((double) numeroMenores / n) * 100.0;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", altMedia);

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdades() < 16) {
				System.out.printf("%s\n", vect[i].getNomes());
			}
		}

		sc.close();
	}

}
/*
 * O %s na linha 57 indica que o valor a ser exibido no local especificado será uma string.
 * Nesse caso, vect[i].getNomes() deve ser uma chamada a um método que retorna
 * uma string (possivelmente o nome de uma pessoa, dado o contexto do código). O
 * valor retornado por vect[i].getNomes() será inserido no local do %s na string
 * de formatação. O \n é um caractere de escape representando uma quebra de
 * linha. Ele é utilizado para inserir uma nova linha após a impressão da string
 * formatada.
 */
