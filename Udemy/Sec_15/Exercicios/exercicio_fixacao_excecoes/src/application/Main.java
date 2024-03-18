package application;

import entities.Account;
import exceptions.BussinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        acc.withdraw(amount);
        System.out.printf("Novo saldo: %.2f%n", acc.getBalance());

        } catch (BussinessException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }
        sc.close();
    }
}

/*
    Fazer um programa para ler os dados de uma conta bancária e depois realizar um
    saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
    ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
    saque da conta. Implemente a conta bancária conforme projeto abaixo:
 */