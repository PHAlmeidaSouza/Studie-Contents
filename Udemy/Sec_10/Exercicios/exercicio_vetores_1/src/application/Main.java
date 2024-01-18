package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Quantos numeros voce vai digitar? ");
            System.out.print("Digite um número inteiro positivo (máximo = 10): ");
            n = sc.nextInt();

            if (n <= 0 || n > 10) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (n <= 0 || n > 10);

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}