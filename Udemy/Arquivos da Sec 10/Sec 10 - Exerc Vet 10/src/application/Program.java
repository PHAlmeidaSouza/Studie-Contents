package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).  */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno:\n", (i + 1));
			sc.nextLine();
			String nomes = sc.nextLine();
			double notas1Sem = sc.nextDouble();
			double notas2Sem = sc.nextDouble();
			vect[i] = new Product(nomes, notas1Sem, notas2Sem);
		}

		System.out.println("Alunos aprovados:");

		 boolean alunoAprovado = false;  // Variável para verificar se há alunos aprovados

         for (int i = 0; i < vect.length; i++) {
             double media = (vect[i].getNotas1Sem() + vect[i].getNotas2Sem()) / 2;
             if (media >= 6.0) {
                 System.out.println(vect[i].getNomes());
                 alunoAprovado = true;  // Pelo menos um aluno foi aprovado
             }
         }
         
         if (!alunoAprovado) {
             System.out.println("Nenhum aluno possui média maior ou igual a 6.0.");
         }

		sc.close();
	}

}
