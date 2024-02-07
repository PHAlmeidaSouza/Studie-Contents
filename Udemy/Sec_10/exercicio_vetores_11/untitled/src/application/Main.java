package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        People[] vect = new People[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char gender = sc.next().charAt(0);
            vect[i] = new People(height, gender);
        }

        double menorAltura = vect[0].getHeight();
        double maiorAltura = vect[0].getHeight();
        int quantidadeMulheres = 0;
        double alturaTotalMulheres = 0;
        int quantidadeHomens = 0;
        for (int i = 0; i < n; i++) {
            if (maiorAltura < vect[i].getHeight()) {
                maiorAltura = vect[i].getHeight();
            }
            if (menorAltura > vect[i].getHeight()) {
                menorAltura = vect[i].getHeight();
            }
            if (vect[i].getGender() == 'F') {
                quantidadeMulheres += 1;
                alturaTotalMulheres += vect[i].getHeight();
            }
            if (vect[i].getGender() == 'M') {
                quantidadeHomens += 1;
            }
        }

        double mediaMulheres = alturaTotalMulheres / quantidadeMulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Menor altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.print("Numero de homens = " + quantidadeHomens);

        sc.close();
    }
}

/*
    Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
    que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    de homens
 */