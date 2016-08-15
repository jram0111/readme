package ex2_23;

import java.util.Scanner;

/**
 *Exercise 2.23
 * @author jonathanramirez
 */
public class Ex2_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance;
        double milesPerGallon;
        double pricePerGallon;

        // Getting input from user
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        pricePerGallon = input.nextDouble();

        input.close(); // closing scanner

        double total = distance / milesPerGallon * pricePerGallon;
        // Displaying total cost
        System.out.printf("The cost of driving is $%.2f", total);
    }
    
}
