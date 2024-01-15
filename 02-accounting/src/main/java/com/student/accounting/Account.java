/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.accounting;

/**
 *
 * @author s0542191
 */
public class Account {
    private double balance;
    private static String name;
    
    public Account(double startingBalance){
        balance = startingBalance;
        System.out.println("Creating account open balance is $" + balance);
    }
    public void printBalance(){
        System.out.println("Your balance is: $" + balance);
    }
    public void deposit(double amount){
        System.out.println("You deposit: $" + amount);
        balance += amount;
    }
    public void withdraw(double amount){
        System.out.println("You withdraw: $" + amount);
        balance -= amount;
    }
}
