package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        Student[] vect = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");
            sc.nextLine();
            String name = sc.nextLine();
            double first_semester = sc.nextDouble();
            double second_semester = sc.nextDouble();
            vect[i] = new Student(name, first_semester, second_semester);
        }

        double media = 0.0;
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            media = (vect[i].getFirst_semester() + vect[i].getSecond_semester()) / 2;
            if (media >= 6.0) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }
}

/*
    Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
    os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
    igual a 6.0 (seis).
 */