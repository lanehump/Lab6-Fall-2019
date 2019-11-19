
/**
 * Write a description of class Value here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Value
{
    
    private double one;
    private String str;
    public Value(double amount){
        one = amount;
    }
    public Value(String amount){
        str = amount;
    }
    public void compareFP2(double amount){
        final double EPSILON = 0.0049;//here i set a value to epsilon
        //my if statements test if the value is within the parameter epsilon
        if (Math.abs(one - amount) <= EPSILON){
            System.out.println("The values are about the same");
        }
        else{
            System.out.println("The values are not close enough.");
        }
     }
    public void compareFP5(double amount){
        final double EPSILON = 0.0000049;//here i set a value to epsilon
        //my if statements test if the value is within the parameter epsilon
        if (Math.abs(one - amount) <= EPSILON){
            System.out.println("The values are about the same");
        }
        else{
            System.out.println("The values are not close enough");
        }
     }
    public void compareSentence(String amount){
        int ret = str.compareTo(amount);//Here i set the return value from the compare to method to a value
        //if the value is equal to zero they are the same
        if (ret == 0){
            System.out.println("The Strings are the same");
        }
        else{
            System.out.println("The Strings are not the same");
        }
     }
   }

