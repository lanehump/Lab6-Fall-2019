
/**
 * Static class for calculations of weight on many planets.
 *
 * @author (Lane Humphreys)
 * @version (10/17/19)
 */
public class Calc
{
    /**
     * Returns the weight on Earth
     */
    public static double earthWeight(double weight){   
        return weight;
    }
    /**
     * Returns the weight on the Moon
     */
    public static double moonWeight(double weight){
        weight = weight * 0.1666;
        return weight;
    }
    /**
     * Returns the weight on Mercury
     */
    public static double mercuryWeight(double weight){
        weight = weight * .4;
        return weight;
    }
    /**
     * Returns the weight Venus
     */
    public static double venusWeight(double weight){
        weight = weight * .9;
        return weight;
    }
    /**
     * Returns the weight on Jupiter
     */
    public static double jupiterWeight(double weight){
        weight = weight * 2.5;
        return weight;
    }
    /**
     * Returns the weight on Saturn
     */
    public static double saturnWeight(double weight){
        weight = weight * 1.1;
        return weight;
    }
}
