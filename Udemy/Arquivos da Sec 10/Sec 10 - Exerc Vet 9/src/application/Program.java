package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VetorIdade;
import entities.VetorNome;

/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.  */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();

		VetorNome[] vect2 = new VetorNome[n];
		VetorIdade[] vect1 = new VetorIdade[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomes = sc.nextLine();

			System.out.print("Idade: ");
			int idades = sc.nextInt();

			vect2[i] = new VetorNome(nomes);
			vect1[i] = new VetorIdade(idades);
		}

		int maiorIdade = vect1[0].getIdade();
		int posicaoMaior = 0;

		for (int i = 0; i < n; i++) {
			if (vect1[i].getIdade() > maiorIdade) {
				maiorIdade = vect1[i].getIdade();
				posicaoMaior = i;
			}
		}
		System.out.println();
		System.out.printf("Pessoa mais velha: %s%n", vect2[posicaoMaior]);
		System.out.println("Sua respectiva idade: " + maiorIdade);

		sc.close();
	}

}
