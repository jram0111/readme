package ex2_5;

import java.util.Scanner;

/**
 *Exercise 2.5
 * @author jonathanramirez
 */
public class Ex2_5 {

    
    public static void main(String[] args) {
      
          double gratuityRate,
                gratuityTotal,
                total,
                subtotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuityTotal = subtotal * gratuityRate * .01;
        total = subtotal + gratuityTotal;

        System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);
    }
    
}
