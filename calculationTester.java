
/**
 * Tester class for a static class.
 *
 * @author (Lane Humphreys)
 * @version (10/17/19)
 */
import java.util.Scanner;
public class calculationTester
{
    public static void main(String[]args){
        //Constructs scanner
        Scanner scan = new Scanner(System.in);
        //creates variable weight with user input
        double weight = scan.nextDouble();
        //Prints the weight on Earth
        System.out.println("Your weight on Earth is: " + Calc.earthWeight(weight) + " pounds");
        //prints the weight on the moon
        System.out.println("Your weight on the Moon is: " + Calc.moonWeight(weight) + " pounds");
        //prints the weight on mercury
        System.out.println("Your weight on Mercury is: " + Calc.mercuryWeight(weight) + " pounds");
        //prints the weight on venus
        System.out.println("Your weight on Venus is: " + Calc.venusWeight(weight)+ " pounds");
        //prints the weight on jupiter
        System.out.println("Your weight on Jupiter is: " + Calc.jupiterWeight(weight)+ " pounds");
        //prints the weight on saturn
        System.out.println("Your weight on Saturn is " + Calc.saturnWeight(weight) + " pounds");
    }
}
