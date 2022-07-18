
/**
 * A driver program to test Person
 */
public class ArrayOfPerson
{
 
    public static void main(String[] args){
        
        
        Person [] roster = {
            new Person("Sam Smith", 22), 
            new Person("Pat Snead", 66), 
            new Person("Becky Green",21),
            new Person("Bev Hill", 18), 
            new Person("Sandy Beach", 33)};
        
        for (Person p : roster)
            p.myFunc();
        
        roster[4].setName("Mickey Mouse");
        roster[4].setAge(99999);
        
        System.out.println("\nThen we added Mickey...");
        for (int i = 0; i < roster.length; i++)
            System.out.println(roster[i]);
        
    }
}
