import java.util.*;
/**
 * This program catches bad input and terminates, without
 * allowing program to break automatically. Terminates under
 * programmer-control.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CatchBadInput
{
  public static void main(String[] args){
      
      // See what happens when user enters a non-int for
      // the following
      Scanner scnr = new Scanner(System.in);
      try{
          System.out.println("Enter any data type (other than an int)");
          System.out.println("to experience results: ");
          int value = scnr.nextInt();
      }catch (InputMismatchException e){
          System.out.println("Exception detected.");
          System.out.println("Program terminating with bad input.");
      }

  }
}
