package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String lastName;
    private Long personNr;
    private List<Account> accounts;


    public Customer(String name, String lastName, Long personNr) {
        this.name = name;
        this.lastName = lastName;
        this.personNr = personNr;
        this.accounts = new ArrayList<>();
    }

    public void showCustomer() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastName);
        System.out.println("SSN: " + personNr);
    }

    public void removeAccount(Long accountNr){
        for (var account:accounts){
            accountNr.equals(account);
            accounts.remove(account);
        }

    }

    public void removeAllAccount(){
        accounts.removeAll(accounts);
    }




    public void addAccount(Long accountNr) {
        if (accounts.size() == 0) {
            Account a1 = new Account(accountNr);
            accounts.add(a1);
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                var currentAccNumber = accounts.get(i).getAccountNr();
                if (!currentAccNumber.equals(accountNr)) {
                    Account a1 = new Account(accountNr);
                    accounts.add(a1);
                } else {
                    System.out.println("Account with number: " + accountNr + " already exists. Try with another..");

                }
            }

        }
    }

        public void showAccounts () {
            System.out.println();
            for (int i = 0; i < accounts.size(); i++) {
                var tempAcc = accounts.get(i);
                System.out.println(tempAcc.getAccountNr());
            }
        }

        public void getAccount (Long findAccountNumber){
            for (int i = 0; i < accounts.size(); i++) {
                var accountNumber = accounts.get(i).getAccountNr();
                if (accountNumber.equals(accountNumber)) {
                    System.out.println(accounts.get(i));
                }
            }
        }

        public Long getBalance (Long accountNr){
            for (int i = 0; i < accounts.size(); i++) {
                var accountNumber = accounts.get(i).getAccountNr();
                if (accountNumber.equals(accountNr)) {
                    var balance = accounts.get(i).getBalance();
                    System.out.println(balance);
                }
            }
            return accountNr;
        }

        public void deposit (Long accountNr, Long value){
            for (int i = 0; i < accounts.size(); i++) {
                var accountNumber = accounts.get(i).getAccountNr();
                if (accountNumber.equals(accountNr)) {
                    var newBalance = accounts.get(i).getBalance() + value;
                    accounts.get(i).setBalance(newBalance);
                    System.out.println("Deposit on bankaccount: " + accountNr + " is transfered!");
                }
            }
        }

        public boolean withdraw(Long accountNr, Long value){
        for (var account:accounts){
            if (accountNr.equals(account)){
                if (value > account.getBalance()){
                    return false;
                }
                else {
                    var newBalance = account.getBalance() - value;
                    account.setBalance(newBalance);


                }

            }

        }
        return true;

        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getLastName () {
            return lastName;
        }


        public Long getPersonNr () {
            return personNr;
        }

        public List<Account> getAccounts () {
            return accounts;
        }
    }
