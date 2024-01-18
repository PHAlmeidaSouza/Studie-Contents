package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Valores = ");
        for (double a : vect) {
            System.out.printf("%.1f ", a);
        }

        double sum = 0.0;
        for (double b : vect) {
            sum += b;
        }

        System.out.printf("\nSoma = %.2f\n", sum);

        double avg = sum / n;
        System.out.printf("Media = %.2f\n", avg);

        sc.close();
    }
}