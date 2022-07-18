import java.util.*;
/**
 * This program keeps prompting user for input until
 * user provides good input. Uses a do-while loop.
 *
 */
public class KeepAskingAlternativeVersion
{
  public static void main(String[] args){
      
      // See what happens when user enters a non-int for
      // the following
      Scanner scnr = new Scanner(System.in);
      boolean badInput = true; // think positively?
      int value = 0;
      do{
          try{
              System.out.println("Enter an int: ");
              value = scnr.nextInt();
              // if the next statement reached, input was valid
              badInput = false; 
          }catch (Exception q){
              System.out.println("Non-integer detected. Please try again.");
              scnr.nextLine(); // clear out input buffer/line
          }
        }while(badInput); // end do while loop
        System.out.println("You entered: " + value);

  }
}