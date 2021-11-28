package com.company;

public class Account {

    private Long accountNr;
    private Long balance = 0L;
    private String accountType = "debitAccount";


    public Account(Long accountNr) {
        this.accountNr = accountNr;
    }


    public void showAccount(Long accountNr){
        System.out.println("Account number: " + this.accountNr);
        System.out.println("Account balance: " + this.balance);
        System.out.println("Account account type: " + this.accountType);
    }
    public Long getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(Long accountNr) {
        this.accountNr = accountNr;
    }

    public Long getBalance() {
        return balance;
    }


    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
