import java.util.*;

/**
 * Write a description of class Die here.
 *
 * @author Stalvey
 * 
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int numSides;
    private int faceValue;

    /**
     * Constructor for objects of class Die
     */
    public Die(int numSides)
    {
        // initialise instance variables
        if (numSides >= 2)  
            this.numSides = numSides;
        faceValue = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void roll()
    {
        // put your code here
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1; //rand.nextInt(6) returns 0 - (numSides - 1)
    }
    
    public int getFaceValue() 
    {
        return faceValue;
    }
    
    public String toString()
    {
        String rtnString = "Value: " + faceValue;
        return rtnString;
    }
}
