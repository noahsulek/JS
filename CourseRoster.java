import java.util.*;
/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CourseRoster
{
    // instance variables - replace the example below with your own
    private Person[] roster;

    /**
     * Constructor for objects of class Students
     */
    public CourseRoster(int howMany)
    {
        Scanner input = new Scanner(System.in);
        
        roster = new Person[howMany];
        for (int i = 0; i < howMany;i++){
            System.out.print("Enter student's name: ");
            String name = input.next();
            System.out.print("Enter student's age: ");
            int age = input.nextInt();
            roster[i] = new Person(name, age);
            //input.nextLine();
        }
       
    }
    
    public String toString(){
        
        String returnString = "";
        for (Person p : roster)
           returnString += p.toString() + "\n";
        return returnString;
        
    }
    
    // What methods might make sense on a class of Students?

}
