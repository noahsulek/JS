
/**
 * Write a description of class PersonUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonUser
{
    public static void main(String[] args){

      Person p1 = new Person("John", 36);
      System.out.println(p1);
 
      Person p2 = new Person("Jan", 63);
      System.out.println(p2);
      p2.setName("Betty");
      System.out.println(p2);
      System.out.println("The age is: " + p2.getAge( ));
      
   }
}
