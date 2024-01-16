package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points", student.missingPoints());
        } else {
            System.out.println("Pass");
        }

        sc.close();
    }
}

/*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
    para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
    resolver este problema.
 */