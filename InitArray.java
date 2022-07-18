import java.util.*;
/**
 * Read input and initialize array from a method
 * Understanding how parameters and memory work
 */
public class InitArray
{ 
    public static void main(String[] args) {
        
        final int howMany = 6;
        
        // declares an allocates storage for an array of integers
        // int[] anArray = new int[howMany];
        // initArray(anArray);
        // printArray(anArray);
        
        // declares an array, but does not allocate storage
        int[] anotherArray ;
        // tryToAllocate(anotherArray);
        
        
        
        anotherArray = new int[5];
        System.out.println("\nIn main, original anotherArray...");
        printArray(anotherArray);
                
        System.out.println("\ntryToAllocate....");
        tryToAllocate(anotherArray);
        System.out.println("In main, after tryToAllocate...");
        printArray(anotherArray); // why is the array full of zeros?
        
        System.out.println("\ntryToAllocate2...");
        anotherArray = tryToAllocate2(anotherArray);
        System.out.println("In main, after tryToAllocate2...");
        printArray(anotherArray);
        
        System.out.println("\ntryToChange...");
        tryToChange(anotherArray);
        System.out.println("In main, after tryToChange...");
        printArray(anotherArray);
    }
    // an already allocated array can be initialized with values
    // in a method
    public static void initArray(int[] someArrayOfInts){
        
        // Ask the user for values
        System.out.println("Please enter " + someArrayOfInts.length + " integer values.");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < someArrayOfInts.length; i++)
           someArrayOfInts[i] = input.nextInt();
        System.out.println("\nThank you.");
        
    }
    
    public static void printArray(int [] a){
        
        System.out.println("The array contains:");
        for (int index = 0; index < a.length; index++)
           System.out.println("Element at index " + index + ": "
                           + a[index]);
        System.out.println("--------");
    }
    
    // An array that has not been allocated, CANNOT be allocated and returned 
    // via parameter
    public static void tryToAllocate(int [] a){
        
        a = new int[5];
        a[0] = 23;
        a[1] = 10;
        a[4] = 99999;
        printArray(a);
    }
    // An array that has not been allocated, CAN be allocated and returned 
    // via return value
    public static int[] tryToAllocate2(int [] a){   
        a = new int[5];
        a[0] = 23;
        a[1] = 10;
        a[4] = 99999;
        return a; 
    }
    // If the array has been allocated, then you can simply alter the values in the method
    public static void tryToChange(int [] a){   
        a[0] = 23;
        a[1] = 10;
        a[4] = 99999;
        printArray(a);
    }
} 