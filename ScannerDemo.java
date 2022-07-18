import java.util.*;

public class ScannerDemo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); 
        int a = 0, b = -5;
        double c = 10.0, d = 0.2;
        char e = 'e';
        String f = "hello!";
        
        // Display values of variables 
        System.out.println("Originally....");
        System.out.println("a = " + a); System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("e = " + e); 
        System.out.println("f = " + f);
        
        System.out.print("Please enter a (int) value for a: ");
        a = input.nextInt(); 
        System.out.println(); 
        System.out.print("Please enter a (int)  value for b: ");
        b = input.nextInt(); 
        System.out.println(); 
        System.out.print("Please enter  a (real) value for c: ");
        c = input.nextDouble(); 
        System.out.println(); 
        System.out.print("Please enter a (real) value for d: ");
        d = input.nextDouble(); 
        System.out.println(); 
        System.out.print("Please enter a (char) value for e: ");
        e = input.next().charAt(0); 
        System.out.println(); 
        System.out.print("Please enter a String value for f: ");
        f = input.next(); 
        System.out.println();
        
        // Display values of variables 
        System.out.println("Now..."); 
        System.out.println("a = " + a );
        System.out.println("b = " + b);
        System.out.println("c = " + c  );
        System.out.println("e = " + e); 
        System.out.println("f = " + f);
    } 
}