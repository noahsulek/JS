import java.util.*;
/**
 * This program catches bad input and terminates, without
 * allowing program to break automatically. Terminates under
 * programmer-control.
 *
 * 
 */
public class KeepAskingForInputUntilItsGood
{
  public static void main(String[] args){
      
      // See what happens when user enters a non-int for
      // the following
      Scanner scnr = new Scanner(System.in);
      boolean goodInput = false;
      int value = 0;
      while (!goodInput){
          try{
              System.out.println("Enter an int: ");
              value = scnr.nextInt();
              // if the next statement reached, input was valid
              goodInput = true; 
          }catch (Exception e){
              System.out.println("Non-integer detected. Please try again.");
              scnr.nextLine(); // clear out input buffer/line
          }
        } // end while loop
        System.out.println("You entered: " + value);
        // do whateve this program is supposed to do with good input
  }
}
