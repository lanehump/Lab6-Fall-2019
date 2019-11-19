
/**
 * Write a description of class Coupons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Coupons
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter the cost of your groceries: $");
        double groceries = scan.nextDouble();
        if (groceries > 210){
            double coupon = (groceries * .14);
            System.out.printf("You get a discount of $%.2f", coupon);
            System.out.println(" (14% of your purchase)");
        }
        else if (groceries > 150){
            double coupon = (groceries * .12);
            System.out.printf("You get a discount of $%.2f", coupon);
            System.out.println(" (12% of your purchase)");
        }
        else if (groceries > 60){
            double coupon = (groceries * .10);
            System.out.printf("You get a discount of $%.2f", coupon);
            System.out.println(" (10% of your purchase)");
        }
        else if (groceries > 10){
            double coupon = (groceries * .08);
            System.out.printf("You get a discount of $%.2f", coupon);
            System.out.println(" (8% of your purchase)");
        }
        else{
            System.out.println("You do not recieve a discount coupon with your purchase");
        }
    }
}
