/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.student.week06.fileoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author s0542191
 */
public class Week06FileOutput {

    public static void main(String[] args) {

        try ( PrintWriter pw = new PrintWriter(new FileWriter(
                new File("output.txt")))) {
            pw.println("a lazy brown dog jumped over the sleeping red fox");
        } catch (IOException ioEx) {
            System.out.println(ioEx.getMessage());
        }
    }
}
