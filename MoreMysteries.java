
/**
 * Write a description of class MoreMysteries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoreMysteries
{
    public static void main(String [] args){
             
       System.out.println(mystery1(8));
       System.out.println(mystery2(8));
       System.out.println(twoPower(8));      

    }
    
    // precondtion: n >= 0
    public static int mystery1(int n){
        
        if (n == 0)
           return 1;
        else
           return 2 * mystery1(n-1);
    }
    
    // precondtion: n >= 0
    public static int mystery2(int n){
        
        if (n == 0)
           return 1;
        else
           return mystery2(n-1) + mystery2(n-1);
    }
    
    // precondition: n >=1 && n is a power of 2
    public static int twoPower(int n){
        
        if (n == 1)
           return 2;
        else
           return twoPower(n/2) * twoPower(n/2);
    }

}
