package org.example.T14_bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    Account findAccount(String number) {
        Account foundAccount = null;
        for (Account account : this.accounts) {
            if (Objects.equals(account.getNumber(), number)) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
        System.out.println("Account: '" + account.getNumber() + "' added.");
    }

    public void removeAccount(String number) {
        Account accountToRemove = findAccount(number);
        if (accountToRemove != null) {
            this.accounts.remove(accountToRemove);
            System.out.println("Account '" + accountToRemove.getNumber() + "' removed.");
        } else {
            System.out.println("No such account.");
        }
    }

    public void getAccountInfo(String number) {
        Account account = findAccount(number);
        if (account != null) {
            account.getInfo();
        } else {
            System.out.println("No such account.");
        }
    }
}
