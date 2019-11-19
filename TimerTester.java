
/**
 * Write a description of class TimerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimerTester
{
    public static void main(String[]args){
        /**
         * Will return -1 if The first time is before the second
         * Will return 0 if it is the same time
         * Will return 1 if first time comes after the second
         */
        Time one = new Time(1100);
        System.out.println(one.compareTo(900));
    }
}
