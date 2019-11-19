
/**
 * Tests what times come first.
 *
 * @author (Lane Humphreys)
 * @version (10/17/19)
 */
public class Time
{
    private int time1;
    /**
     * Constructs object with given time
     * @param otherTime (0-2359)
     */
    public Time(int aTime){
        time1 = aTime;
    }
    public int compareTo(int otherTime){
        if (time1 < otherTime){
            return -1;
        }
        else if (time1 == otherTime){
            return 0;
        }
        else{
            return 1;
        }
    }
}
