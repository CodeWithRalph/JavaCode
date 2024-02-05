/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.student.week05.tryexcept;

import java.util.Scanner;

/**
 *
 * @author s0542191
 */
public class Week05TryExcept {
    
    public static int getNumber(Scanner x)throws Exception{
        String temp = x.next();
        if (temp.equals("end")) throw new Exception("We are done!");
        int value = Integer.parseInt(temp);
        if (value == 0)throw new ZeroException("That is zero");
        return Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        String userInputHours = "1";
        int hoursWork = 0;
        try {
            hoursWork = Integer.parseInt(userInputHours);
            System.out.println(hoursWork);
        } catch (NumberFormatException exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
            System.out.println("Invalid format");
        } catch (Exception e) {
            e.getMessage();
            System.out.println("unusual error happened");
        }

        // user input
        Scanner userInput = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input integer: ");
                hoursWork = getNumber(userInput);
                System.out.println("hours work: " + hoursWork);
            } catch (NumberFormatException exp) {
                System.out.println(exp.getMessage());
                exp.printStackTrace();
                System.out.println("Invalid format");
            }catch(ZeroException zero){
                System.out.println("yup, no zeroes allowed here");
            } catch (Exception e) {
                System.out.println("an unsual error occured");
                break;
            }
        }
    }
}
