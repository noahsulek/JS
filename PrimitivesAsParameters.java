import java.util.*;
/**
 * Write a description of class PrimitivesAsParameters here.
 
 */
public class PrimitivesAsParameters
{

    public static void main(String[] args) {
        
        int a = 0, b = 0, c = 10;
        System.out.println("In main: initial values a:" + a + ", b:" + b + ", c:" + c);
        initializeVars(a, b, c);
        System.out.println("In main: after method a:" + a + ", b:" + b + ", c:" + c);
   
        
   
    }
    // an primitives can be changed locally, but changes not
    // reflected in caller
    public static void initializeVars(int x, int y, int z){
        
        System.out.println("   In method: values on entry x:" + x + ", y:" + y + ", z:" + z);
        x = 100;
        y = 1000;
        z = -99;
        System.out.println("   In method: values on exit x:" + x + ", y:" + y + ", z:" + z);
    }
    
   


} 