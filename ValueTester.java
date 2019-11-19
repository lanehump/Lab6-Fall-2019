
/**
 * Write a description of class ValueTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ValueTester
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        /**
         * Comparing two floating point decimals
         */
        System.out.println("Pleasde input the two floating point decimals you'd like to compare.");
        double oneFP2 = scan.nextDouble();
        double twoFP2 = scan.nextDouble();
        Value FP2 = new Value(oneFP2);
        FP2.compareFP2(twoFP2);
        System.out.println("I GIVE UP");
        
        /**
         * Comparing 5 floating point decimals
         */
        System.out.println("Please input the 5 floating point decimals you'd like to compare.");
        double oneFP5 = scan.nextDouble();
        double twoFP5 = scan.nextDouble();
        Value FP5 = new Value(oneFP5);
        FP5.compareFP5(twoFP5);
        System.out.println("I GIVE UP");
        
        /**
         * Comparing Strings
         */
        System.out.println("Please enter the sentences you'd like to compare");
        String one = scan.next();
        String two = scan.next();
        Value str = new Value(one);
        str.compareSentence(two);
     }
}
