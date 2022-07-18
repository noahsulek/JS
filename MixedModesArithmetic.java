
/**
 * Write a description of class MixedModesArithmetic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MixedModesArithmetic
{
  
    public static void main(String[] args){
        
        System.out.println(6/4);
        System.out.println(6.0/4);
        System.out.println(6 % 4);
        System.out.println(6 % 4.);
        
        System.out.println(Math.pow(2, 3));
        
        System.out.println("(3 * 2* ( 3 + ( 4 * 3 / ( 20) ) ) ) evaluates to: " + (3 * 2* ( 3 + ( 4 * 3 / ( 20) ) ) ));
        System.out.println("2 % 2 + 3 * 3 – 4 / 4 evaluates to: " 
           + (2 % 2 + 3 * 3 - 4 / 4 ));    
        
        //Something weird is output here...why?
        System.out.println( "7 + 3.0 * ((6 / 4)  – 1.0) " +
           "evaluates to: " + 7 + 3.0 * ((  6 / 4 ) - 1.0 ));
           
          char choice = "zoo".toLowerCase().charAt(0);

          switch (choice) {
      case 'a': 
         System.out.print("Circle ");
     case 'b':
         System.out.print("Square ");
         break;
     case 'c':
         System.out.print("Line ");
         break;
     default:
      System.out.println("Enter 'A\', \'B\', or \'C\'.");
      
    }
System.out.println();

}
}
