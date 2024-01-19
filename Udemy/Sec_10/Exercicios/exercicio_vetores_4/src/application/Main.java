package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int numerosPares = 0;
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int a : vect) {
            if (a % 2 == 0) {
                numerosPares++;
                System.out.printf("%d  ", a);
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", numerosPares);

        sc.close();
    }
}

/*
    Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
    tela todos os números pares, e também a quantidade de números pares.
 */