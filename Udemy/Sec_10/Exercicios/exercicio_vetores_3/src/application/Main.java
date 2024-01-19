package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(name, idade, altura);
        }

        double somaAlturas = 0.0;
        int numeroPessoas = 0;
        int quantidadeMenores = 0;
        for (Pessoa pessoa : vect) {
            somaAlturas += pessoa.getAltura();
            numeroPessoas += 1;
            if (pessoa.getIdade() < 16) {
                quantidadeMenores += 1;
            }
        }
        double alturaMedia = somaAlturas / numeroPessoas;
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        double porcentagemMenores = ((double) quantidadeMenores / numeroPessoas) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagemMenores);

        for (Pessoa nome : vect) {
            if (nome.getIdade() < 16) {
                System.out.printf("%s\n", nome.getName());
            }
        }

        sc.close();
    }
}

/*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver.
 */