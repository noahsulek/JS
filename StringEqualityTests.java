
/**
 * Write a description of class StringEqualityTests here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringEqualityTests
{
    public static void main(String[] args){
        final double VALUE_OF_QUARTER = .25;
        
    	String str1 = "Hello World";
	String str2 = "Hello ";
	String str3 = "World";
	String str4 = str2 + str3;
	String str5 = str1;
	
	System.out.println("str1: " + str1);
	System.out.println("str2: " + str2);
	System.out.println("str3: " + str3);
	System.out.println("str4: " + str4);
	System.out.println("str5: " + str5);
	
	if (str1 == str4) {
		System.out.println("Strings (str1 == str4) are the same");
	}
	else {
		System.out.println("Strings (str1 == str4) are not the same");			
	}
	
	if (str1.equals(str4)) {
		System.out.println("Strings (str1.equals(str4)) are the same");
	}
	else {
		System.out.println("Strings (str1.equals(str4)) are not the same");			
	}

	if (str1 == str5) {
		System.out.println("Strings (str1 == str5) are the same");
	}
	else {
		System.out.println("Strings (str1 == str5) are not the same");			
	}

	if (str4 == "Hello World") {
		System.out.println("Strings (str1 == \"Hello World\") are the same");
	}
	else {
		System.out.println("Strings (str1 == \"Hello World\") are not the same");			
	}

	if (str4 == "Hello" + " World") {
		System.out.println("Strings (str1 == \"Hello\" + \" World\") are the same");
	}
	else {
		System.out.println("Strings (str1 == \"Hello\" + \" World\") are not the same");			
	}
	
	if ("hello".equals("HELLO"))
	   System.out.println("\"hello\".equals(\"HELLO\") - Yes");
	else
	   System.out.println("\"hello\".equals(\"HELLO\") - NO");
	   
	String a = "apple";
	String b = "apple";
	System.out.println("a == b " + (a == b));
	System.out.println("a.equals(b) " + (a.equals(b)));
	System.out.println(("Bary".compareTo("Barry")));

    }
}
