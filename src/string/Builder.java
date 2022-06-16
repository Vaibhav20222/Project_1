package string;

public class Builder 
{
	/*
	StringBuilder 
	The StringBuilder in Java represents a mutable sequence of characters. 
	Since the String Class in Java creates an immutable sequence of 
	characters, the StringBuilder class provides an alternative to 
	String Class, as it creates a mutable sequence of characters. 
	The function of StringBuilder is very much similar to the 
	StringBuffer class, as both of them provide an alternative to 
	String Class by making a mutable sequence of characters. 
	However the StringBuilder class differs from the StringBuffer 
	class on the basis of synchronization. The StringBuilder class 
	provides no guarantee of synchronization whereas the StringBuffer 
	class does. Therefore this class is designed for use as a drop-in 
	replacement for StringBuffer in places where the StringBuffer was 
	being used by a single thread (as is generally the case). 
	Where possible, it is recommended that this class be used in 
	preference to StringBuffer as it will be faster under most 
	implementations. Instances of StringBuilder are not safe for use 
	by multiple threads. If such synchronization is required then 
	it is recommended that StringBuffer be used.
	
	
	
	Class Hierarchy: 
 
	java.lang.Object
	     java.lang
	        Class StringBuilder
	
	Syntax: 
 

	public final class StringBuilder
	    extends Object
	    implements Serializable, CharSequence
	Constructors in Java StringBuilder: 
	 
	
	StringBuilder(): Constructs a string builder with no characters 
					in it and an initial capacity of 16 characters.
	 
	StringBuilder(int capacity): Constructs a string builder with no 
							characters in it and an initial capacity 
							specified by the capacity argument.
	 
	StringBuilder(CharSequence seq): Constructs a string builder that 
	                                contains the same characters as 
	                                the specified CharSequence.
	 
	StringBuilder(String str): Constructs a string builder initialized 
							   to the contents of the specified string. 
	 */
	
	public static void main(String[] args) 
	{
		// create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str = new StringBuilder();
 
        str.append("GFG");
 
        // print string
        System.out.println("String = "+ str);
        
        System.out.println("String = " + str.toString());
        
 
        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String1 = " + str1.toString());
 
        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);
 
        // print string
        System.out.println("String2 capacity = "+ str2.capacity());
 
        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3 = new StringBuilder(str1.toString());
 
        // print string
        System.out.println("String3 = " + str3.toString());
		
        
        System.out.println("=======================================");
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder obj1 = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String = "+ obj1.toString());
 
        // reverse the string
        StringBuilder reverseStr = obj1.reverse();
 
        // print string
        System.out.println("Reverse String = "+ reverseStr.toString());
 
        // Append ', '(44) to the String
        obj1.appendCodePoint(44);
 
        // Print the modified String
        System.out.println("Modified StringBuilder = "+ obj1);
 
        // get capacity
        int capacity = obj1.capacity();
 
        // print the result
        System.out.println("StringBuilder = " + obj1);
        System.out.println("Capacity of StringBuilder = "+ capacity);
	}

}
