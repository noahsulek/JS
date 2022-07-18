import java.util.Scanner;

// zybooks participation exercise 2.2.1
 
public class AgePrinter {
   public static void main (String [] args) {
      int userAge;
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter your age: ");
      userAge = scnr.nextInt();
      
      System.out.println(userAge + " is a great age.");
   }
}