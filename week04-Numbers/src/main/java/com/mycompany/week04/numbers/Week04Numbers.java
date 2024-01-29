/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.week04.numbers;

import javax.swing.JOptionPane;

/**
 *
 * @author s0542191
 */
public class Week04Numbers {

    public static void main(String[] args) {
        Byte one = 0;
        byte primeOne = 0;

        String temp = one.toString();
        String temp2 = Byte.toString(one);

        Byte temp3 = Byte.parseByte("101", 2);

        String s1 = "Hey";
        String s2 = "Hi";

        int a = s1.compareTo(s2);

        // String;
        String name = "Jhen Eric";

        StringBuilder space = new StringBuilder(name);
        space.append(" lives here.");
        
        StringBuilder space2 = space.replace(10, 10, "don't ");

        // Get input from a user
        String inputName = JOptionPane.showInputDialog("Enter name:");
        
        String inputAge = JOptionPane.showInputDialog("Enter age:");
        Integer age = Integer.parseInt(inputAge);
        
        System.out.println();
    }
}
