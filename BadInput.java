import java.util.*;
/**
 * This program breaks when a user enters bad (non-integer) input.
 * It is not good to deliver code like this to a client.
 */
public class BadInput
{
  public static void main(String[] args){
      
      // See what happens when user enters a non-int for
      // the following
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter any data type (other than an int)");
      System.out.println("to experience results: ");
      int value = scnr.nextInt();

  }
}
