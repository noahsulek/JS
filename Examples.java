import java.util.*;


public class Examples
{
    public static void hiThere()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, Can I greet you again? ");
        String input = scan.nextLine( );
        if (input.equals("yes"))
               hiThere();
        
    }
    
    public static void cheers (int n)
    {
	if (n == 1)
            System.out.println("Hurray");
	else
	{
	    System.out.print("Hip ");
	    cheers(n-1);  
        }
    }

    public static void cheersAgain (int n)
    {
	if (n == 1)
            System.out.println("Hurray");
	else
	{
	    cheersAgain(n-1);
	    System.out.print("Hip "); 
        }
    }
    
    public static int functionF(int n) throws Exception
    {
        int ans;
        
        if (n == 0)
            ans = 3;
        else if (n > 0)
        {
            ans = 2 * functionF(--n) + 3;
        }
        else
            throw new Exception ("Cannot calculate function for negative values.");
        return ans;           
    }
    public static void main()
    {
        System.out.println("hiThere()");
        hiThere();
        
        System.out.println("\ncheers(4):");
        cheers(4);
        System.out.println("\ncheersAgain(4)");
        cheersAgain(4);
        
        System.out.println("\n\nf() - Recursive function MATH 207");
        int answer;
        int [] values = {0, 1, 2, 3, 4, -5, 10};
        for (int val : values)
            try
            {
                answer = functionF(val);
                System.out.println("f(" + val + ") = " + answer);
            }
            catch (Exception e)
            {
                System.out.println(val + ": " + e.getMessage());
            }
    }

}
