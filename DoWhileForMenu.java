import java.util.*;
/**
 * Write a description of class DoWhileVsWhileForMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoWhileForMenu
{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String answer = ""; // empty string
        // Since a menu must be printed at least once, and possibly many times,
        // a do-while loop makes sense
        do{
            // generate menu
            System.out.println("Please choose an option:");
            System.out.println("a - do something ");
            System.out.println("b - do something else ");
            System.out.println("c - quit - this is boring ");
            System.out.print("Choice? :");
            answer = input.nextLine();
            // Handle choice, then loop again
            // if choice is a
            // else if choice is b
            
        }while (!answer.equals("c"));
    }
}
