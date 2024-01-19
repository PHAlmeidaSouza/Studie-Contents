package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + vect[i];
        }

        System.out.println();
        double media = soma / n;
        System.out.printf("MEDIA DO VETOR: %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (double a : vect) {
            if (a < media) {
                System.out.printf("%.1f%n", a);
            }
        }

        sc.close();
    }
}

/*
    Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */