
/**
 * An array being processed should not contain any
 * zero values. A zero causes termination of loop.
 */

public class LoopInTryCatch
{
   public static void main(String [] args) throws Exception{
       
       int [] arr = { 12, 10, 0, 15, -2};
       
       try{
           for (int index = 0; index < arr.length; index++)
           {
               if (arr[index] == 0)
                  throw new Exception ("Found zero.");
               else
                  System.out.println(arr[index]);
            }
        }catch (Exception e) {
            System.out.println("Yikes, " + e + " " + e.getMessage());
        }
    }
}
