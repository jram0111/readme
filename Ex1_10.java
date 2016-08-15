
package ex1_10;

/**
 *
 * @author jonathanramirez
 * exercise 1.10
 */
public class Ex1_10 {

    public static void main(String[] args) {
        double kilometers = 14.0;
        double miles = kilometers / 1.6;
        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / rate;

        System.out.println(milesPerHour);
    }
    
}
