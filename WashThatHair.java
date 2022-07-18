import java.util.*;

public class WashThatHair
{   
    static int numWashes = 0;
    
    public static void lather(int pauseTime)
    {  
       try {
            System.out.println("I'm lathering!");
            Thread.sleep(pauseTime);
       }
       catch (InterruptedException ie)
       {
            System.out.println("The thread was interrupted while shampooing.");
       }
    }
     
    public static void rinse(int pauseTime)
    {  
        try
        {
            System.out.println("I'm rinsing!"); 
            Thread.sleep(pauseTime);
        }
        catch (InterruptedException ie)
        {
            System.out.println("The thread was interrupted while rinsing.");
        }
    }
    
    public static void shampoo(int numRepeats)
    {  
        int pause = 50;
        // numWashes++;
        // System.out.println("Wash #: " + numWashes);
        lather(pause);
        rinse(pause);
        if (numRepeats > 1)
        {
            numRepeats--;
            shampoo(numRepeats);  
            //numRepeats--;
        }
        else
            System.out.println("All clean!");
        System.out.println("Repeat #: " + numRepeats);
        // if (numWashes < 10)
            // shampoo();
        // else
            // System.out.println("\nAll clean!");
        
    }
    
    public static void main(String [] args)
    {
        System.out.println("Ready to wash your hair? Press <Enter> to begin!");
        Scanner scnr = new Scanner(System.in);
        String nothing = scnr.nextLine();
        shampoo(5);
    }
}
