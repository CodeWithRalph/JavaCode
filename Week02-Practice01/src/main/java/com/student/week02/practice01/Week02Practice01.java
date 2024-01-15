/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.student.week02.practice01;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s0542191
 */
public class Week02Practice01 {

    public static void main(String[] args) {
        int number = 21;
        System.out.println(number);
        
        String theString = Integer.toString(number);
        System.out.println(theString);
        
        Integer theInteger = number;
        System.out.println(theInteger.toString());
        
        List myList = new ArrayList();
        myList.add(1);
        System.out.println(myList);
    }
}
