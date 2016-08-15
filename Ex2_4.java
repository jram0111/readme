package ex2_4;

import java.util.Scanner;
/**
* @author jonathanramirez
* exercise 2.4
 */
public class Ex2_4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
    
}
