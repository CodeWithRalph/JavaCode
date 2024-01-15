/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.student.accounting;

/**
 *
 * @author s0542191
 */
public class Accounting {

    public static void main(String[] args) {
        Account checking = new Account(500);
        checking.withdraw(150.00);
        checking.deposit(22.50);
        checking.withdraw(47.62);
        checking.printBalance();
    }
}
