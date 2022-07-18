
/**
 * Practice class.
 *
 * @author Mercedes Banker
 * @version 1
 * 
 * Practice Problems for 1D arrays - 
 */
public class Practice
{
    public static String sameElementArray(int[] array1,int[] array2) {
        String message = "";
        if ((array1[0] == array2[0]) || (array1[array1.length-1] == array2[array2.length-1])) {
            message = "Yes";
        }
        else {
            message = "No";
        }
        return message;
    }
    
    public static int [] middleElementArray(int[] array1,int[] array2) {
        int [] c = new int[2];
        c[0] = array1[1];
        c[1] = array2[1];
        return c;
    }
    
    public static char arraySums(int[] array1,int[] array2) {
        char bigger = 'z';
        int sum1 = 0;
        int sum2 = 0;
        sum1 = array1[0] + array1[1];
        sum2 = array2[0] + array2[1];
        if (sum1 > sum2) {
            bigger = 'a';
        }
        else if (sum2 > sum1) {
            bigger = 'b';
        }
        else {
            bigger = 'a';
        }
        return bigger;
    }
    
    public static void main(String [] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {7,3};
        int [] arr3 = {7,3,2};
        int [] arr4 = {1,3};
        String test1 = "";
        String test2 = "";
        String test3 = "";
        
        int [] a = {4,5,6};
        int [] b = {7,7,7};
        int [] c = {3,8,0};
        int [] d = {5,2,9};
        int [] e = {1,4,5};
        
        int [] array1 = {1,2};
        int [] array2 = {3,4};
        int [] array3 = {1,1};
        int [] array4 = {3,0};
        char char1 = 'z';
        char char2 = 'z';
        char char3 = 'z';
        char char4 = 'z';
        
        
        test1 = sameElementArray(arr1,arr2);
        test2 = sameElementArray(arr1,arr3);
        test3 = sameElementArray(arr1,arr4);
        System.out.println("Practice Problem #1:");
        System.out.println();
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println();
        
        System.out.println("Practice Problem #2:");
        System.out.println();
        System.out.print("Test 1: ");
        int [] f = middleElementArray(arr1,a);
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        System.out.print("Test 2: ");
        int [] g = middleElementArray(b,c);
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
        System.out.println();
        System.out.print("Test 3: ");
        int [] h = middleElementArray(d,e);
        for (int i = 0; i < h.length; i++) {
            System.out.print(h[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Practice Problem #3:");
        System.out.println();
        char1 = arraySums(array1,array2);
        System.out.println("Test 1: " + char1);
        char2 = arraySums(array2,array1);
        System.out.println("Test 2: " + char2);
        char3 = arraySums(array3,array2);
        System.out.println("Test 3: " + char3);
        char4 = arraySums(array2,array4);
        System.out.println("Test 4: " + char4);
        System.out.println();
    }
}
