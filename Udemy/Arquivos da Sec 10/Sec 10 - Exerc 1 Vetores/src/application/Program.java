package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int a = sc.nextInt();
		
		int[] vect = new int[a];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número:");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números Negativos:");

	    for (int i=0; i<a; i++) {
	        if (vect[i] < 0) {
	        	System.out.println(vect[i]);
	        }
	    }
		
		sc.close();
	}

}
