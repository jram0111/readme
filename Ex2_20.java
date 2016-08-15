package ex2_20;

import java.util.Scanner;

/**
 *Exercise 2.20
 * @author jonathanramirez
 */
public class Ex2_20 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble() / 100;

        double interest = balance * (annualInterestRate / 12);

        System.out.print("The interest is " + interest);
    }
    
}
