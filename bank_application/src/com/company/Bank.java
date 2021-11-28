package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    //Creates a customer
    public void createCustomer(String name, String lastName, Long personNr){

        Customer c1 = new Customer(name, lastName, personNr);
        customers.add(c1);
    }

    //Adds a customer to the list. Not neccesary i do it in the step above.
    public void addCustomer(Customer c){
        customers.add(c);
    }

    //Finds a customer in the list by searching the personNr
    public void findCustomer(Long personNr){

        for (int i = 0; i < customers.size(); i++){
            var customer = customers.get(i);
            if (customer.getPersonNr().equals(personNr)){
                customer.showCustomer();
            }
        }

    }

    //Remove an account from a customer
    public void removeAccount(Long persoNr, Long accountNr){
        for (var customer:customers){
            persoNr.equals(customer);
            customer.removeAccount(accountNr);
        }
    }

    //Creates an account
    public void addAccount(Long personNr, Long accountNr){
        for (var customer: customers) {
            if (personNr.equals(customer.getPersonNr())){
                customer.addAccount(accountNr);
            }

        }
    }
    //Deposit an amount to a specific account
    public void deposit(Long personNr, Long accountNr, Long value) {
        for (var customer: customers) {
            if (personNr.equals(customer.getPersonNr())){
                customer.deposit(accountNr, value);
            }
        }

        
    }
    //Shows all customers in the bank
    public void showAllCustomers(){
        for (int i = 0; i < customers.size(); i++){
            var show = customers.get(i);
            show.showCustomer();

        }


    }
    //Removes a customer and their accounts
    public void removeCustomer(Long persoNr){
        for (var customer:customers) {
            if (persoNr.equals(customer.getPersonNr())){
                customer.removeAllAccount();
                customers.remove(customer);



            }

        }
    }
    //Changes the name of a customer
    public void changeName(Long persoNr, String name){
        for (var customer:customers){
            if (persoNr.equals(customer.getPersonNr())){
                customer.setName(name);
            }
        }
    }


}
