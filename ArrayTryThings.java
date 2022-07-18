
public class ArrayTryThings
{
    public static void main(String[] args){
        
        int[] arr1 = new int[0]; // an array with no storage - useless
        // arr1[0] = 3; // will generate ArrayIndexOutOfBoundsException
        arr1 = new int[5];
        System.out.println("The numbers in arr1 are: ");
        for (int i : arr1)
           System.out.println(i);
        
        String[] arr2 = new String[7];
        arr2[0] = "";
        arr2[5] = "there";
        System.out.println("The length of arr2[0] is " + arr2[0].length());
        // System.out.println("The length of arr2[3] is " + arr2[3].length());       
        System.out.println("The strings in arr2 are: ");
        for (String s : arr2)
           System.out.println(s);
        // System.out.println("The length of arr2[10] is " + arr2[10].length());   
         

        boolean[] arr3 = new boolean[5];
        System.out.println("The values in arr3 are: ");
        for (boolean b : arr3)
           System.out.println(b);
             
        char[] arr4 = new char[9];
        System.out.println("The values in arr4 are: ");
        for (char ch : arr4)
           System.out.println("-" + ch + "-" );
        System.out.println("End of output");
    }
}
