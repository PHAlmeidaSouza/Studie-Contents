package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        double somaMediaTotalPares = 0.0;
        int quantidadePares = 0;
        for (int a : vect) {
            if (a % 2 == 0) {
                somaMediaTotalPares += a;
                quantidadePares++;
            }
        }
        double mediaFinal = somaMediaTotalPares / quantidadePares;

        if (quantidadePares != 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", mediaFinal);
        } else {
            System.out.println("NENHUM NUMERO PAR ");
        }

        sc.close();
    }
}

/*
    Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
    aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
    digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */