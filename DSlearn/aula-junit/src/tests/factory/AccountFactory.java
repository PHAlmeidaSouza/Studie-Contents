package tests.factory;

import entities.Account;

public class AccountFactory {

    public static Account createEmptyAccount() {
        return new Account(1L, 0.0);
    }

    public static Account createAccount(Double initialBalance) {
        return new Account(1L, initialBalance);
    }
}
