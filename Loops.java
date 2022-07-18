
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops
{
   public static void main (String [] args)
   {
       
       System.out.println("for....");
       for (int i = 3; i <= 6; i++)
       {
           System.out.print(i + " ");
       }
       
       //System.out.println("\nAfter the loop i = " + i + "\n");
       
       for (int j = 0; j < 10; j += 2)
       {
           System.out.print(j + " ");
       }
       System.out.println("\n");
       
       for (int j = 25; j >= 10; j -= 3)
       {
           System.out.print(j + " ");
       }
       System.out.println("\n");
       
       String[] words = {"Hi", "Bye", "Java", "Today"};
       
       for (String word : words)
       {
          System.out.print(word + ".");
       }
       System.out.println("\n");
       
       System.out.println("while...");
       int k = 0;
       
       while (k < 50)
       { 
           k += 5;
           System.out.print(k + " ");
       }
       
       System.out.println("\nAfter the loop k = " + k + "\n");
       
       k = 0;
       
       while (k < 50)
       { 
           System.out.print(k + " ");
           k += 5;
       }
       
       System.out.println("\nAfter the loop k = " + k + "\n");
       
       k = 1000;
       
       while (k < 50)
       { 
           System.out.print(k + " ");
           k += 5;
       }
       
       System.out.println("\nAfter the loop k = " + k + "\n");
       
       System.out.println("do/while....");
       k = 0;
       
       do
       { 
           k += 5;
           System.out.print(k + " ");
       } while (k <= 15);
       
       System.out.println("\nAfter loop k = " + k + "\n");
       
       k = 0;
       do
       { 
           System.out.print(k + " ");
           k += 5;
       } while (k <= 15);
       System.out.println("\nAfter loop k = " + k + "\n");
       
       k = 1000;
       
       
       do
       { 
           System.out.print(k + " ");
           k += 5;
       } while (k <= 15);
       
       System.out.println("\nAfter loop k = " + k + "\n");
       
   }
}
