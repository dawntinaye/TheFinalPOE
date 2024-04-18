/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprogram;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Javaprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

public class AverageCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Calculate sum
            double sum = num1 + num2;
            
            // Calculate average
            double average = sum / 2;
            
            System.out.println("The sum of the two numbers is: " + sum);
            System.out.println("The average of the two numbers is: " + average);
        }
    }
}

}
