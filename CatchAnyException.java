import java.util.*;
/**
 * This program catches any exception and terminates, without
 * allowing program to break automatically. Terminates under
 * programmer-control.
 */
public class CatchAnyException
{
  public static void main(String[] args){
      
      // See what happens when user enters a non-int for
      // the following
      Scanner scnr = new Scanner(System.in);
      int response = 0;
      do{
          try{
              System.out.println("Which type of Exception would you like to try?");
              System.out.println("1- input mismatch");
              System.out.println("2- null pointer"); 
              System.out.println("3- array index out of bounds");
              System.out.println("4- string index out of bounds");
              System.out.println("5- divide by zero");
              System.out.println("0 - to exit this program");
              response = scnr.nextInt();
              if (response == 1){
                  System.out.println("Please enter a String below");
                  int input = scnr.nextInt();
              }
              else if (response == 2){
                  String s = null;
                  s.charAt(0); 
              }
              else if (response == 3){
                  int[] a = new int[5];
                  a[14] = 12;
              }
              else if (response == 4){
                  String s = "hello";
                  s.charAt(20);
              }
              else if (response == 5){
                  int x = 10/0;
              }
              else System.out.println("OK, bye");
          }catch(NullPointerException e){
            System.out.println("Null pointer detected.");
          }
          catch (InputMismatchException p){
              System.out.println("You entered bad input.");
              
          } catch (Exception r){
              System.out.println("Exception detected: " + r);
              System.out.println();System.out.println();
          }
          System.out.println();
        }while (response != 0);

  }
}
