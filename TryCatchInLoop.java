
/**
 * Zeros in array should not be processed.
 */
public class TryCatchInLoop
{
   public static void main(String [] args){
       
       int [] arr = { 12, 10, 0, 15, -2};
       
      
           for (int index = 0; index < arr.length; index++)
           {
               try{
                 if (arr[index] == 0)
                    throw new Exception ("Found zero");
                 else
                   System.out.println(arr[index]);
                }catch (Exception e) {
                   System.out.println("Yikes, " + e.getMessage());
                }
           }
    }
}
