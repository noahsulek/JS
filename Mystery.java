
/**
 * Write a description of class Mystery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mystery
{
    public static void main(String [] args){
             
       int[] a = {10, 20, -4, 0, 13};
       System.out.println( mystery(a, 0) );

    }
    
    public static int mystery(int [] ls, int x){
        
        if (x == ls.length-1)
           return ls[x];
        else
           return Math.min( ls[x], mystery( ls, x+1 ) );
    }
}
