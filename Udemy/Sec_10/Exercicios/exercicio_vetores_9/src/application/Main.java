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
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print(   "Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoa(name, idade);
        }

        int maiorIdade = 0;
        Pessoa pessoaMaiorIdade = null;
        for (Pessoa pessoa : vect) {
            if (pessoa.getIdade() > maiorIdade) {
                maiorIdade = pessoa.getIdade();
                pessoaMaiorIdade = pessoa;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaiorIdade.getNome());

        sc.close();
    }
}

/*
    Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
    devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
    da pessoa mais velha.
 */