package string;

public class Buffer 
{
	
	/* Constructors of StringBuffer class
	 * 
	 * 1. StringBuffer(): It reserves room for 16 characters without reallocation
	 * 
	 * StringBuffer s = new StringBuffer(); 
	 * 
	 * 
	 * 2. StringBuffer( int size): It accepts
	 * an integer argument that explicitly sets the size of the buffer.
	 * 
	 * StringBuffer s = new StringBuffer(20); 
	 * 
	 * 3. StringBuffer(String str): It
	 * accepts a string argument that sets the initial contents of the StringBuffer
	 * object and reserves room for 16 more characters without reallocation.
	 * 
	 * StringBuffer s = new StringBuffer("Vaibhav Avhad");
	 * 
	 * 
	 * 
	 * Methods of StringBuffer class 

		                Methods	Action Performed
		
		1. append()	Used to add text at the end of the existing text.
		2. length()	The length of a StringBuffer can be found by the length( ) method
		3. capacity()	the total allocated capacity can be found by the capacity( ) method
		4. charAt()	 
		5. delete()	Deletes a sequence of characters from the invoking object
		6. deleteCharAt()	Deletes the character at the index specified by loc
		7. ensureCapacity()	Ensures capacity is at least equals to the given minimum.
		8. insert()	Inserts text at the specified index position
		9. length()	Returns length of the string  
		10. reverse()	Reverse the characters within a StringBuffer object
		11. replace()	Replace one set of characters with another set inside a StringBuffer object
	 */
	
	public static void main(String[] args) {
		
	//Example 1: length() and capacity() Methods
		
		// Creating adn storing string by creating object of
        // StringBuffer
        StringBuffer s = new StringBuffer("Vaibhav Avhad");
 
        // Getting the length of the string
        int p = s.length();
 
        // Getting the capacity of the string
        int q = s.capacity();
 
        // Printing the length and capacity of
        // above generated input string on console
        System.out.println("Length of string Vaibhav Avhad="
                           + p);
        System.out.println(
            "Capacity of string Vaibhav Avhad=" + q);
	
		
       /* 
    Example 2: append() 

        It is used to add text at the end of the existing text. 

        Here are a few of its forms: 

        StringBuffer append(String str)
        StringBuffer append(int num)
       */
        
        	// Creating an object of StringBuffer class and
        	// passing random string
        StringBuffer s1 = new StringBuffer("Vaibhav");
 
        // Usage of append() method
        s1.append("Avhad");
 
        // Returns VaibhavAvhad
        System.out.println(s1);
 
        s1.append(1);
        
        // Returns VaibhvAvhad1
        System.out.println(s1);
     
        System.out.println("================================");
   /* Example 3: insert()

        It is used to insert text at the specified index position. 

        Syntax: These are a few of its as follows:

        StringBuffer insert(int index, String str)
        StringBuffer insert(int index, char ch)
        
        Here, the index specifies the index at which point the string 
        will be inserted into the invoking StringBuffer object.
	*/
	
     // Creating an object of StringBuffer class
        StringBuffer s2 = new StringBuffer("NashikPune");
 
        // Inserting element and position as an arguments
        s2.insert(6, "to");
        // Returns NashiktoPune
        System.out.println(s2);
 
        s2.insert(0, 3);
        // Returns 3NashiktoPune
        System.out.println(s2);
 
        s2.insert(7," ");
        // Returns 3Nashik toPune
        System.out.println(s2);
 
        s2.insert(14, 12.45d);
        // Returns 3Nashik toPune12.45
        System.out.println(s2);
 
        s2.insert(0, 3.15f);
        // Returns 3.153Nashik toPune12.45
        System.out.println(s2);
 
        // Declaring and initializing character array
        char geeks_arr[] = { 'V', 'a', 'i', 'b', 'h', 'a', 'v' };
 
        // Inserting character array at offset 9
        s2.insert(2, geeks_arr);
        // Returns 3.pawan153Nashik toPune12.45
        System.out.println(s2);
        System.out.println("==================================");
        
        
    /* Example 4: reverse( )

        It can reverse the characters within a StringBuffer object 
        using reverse( ). This method returns the reversed 
        object on which it was called. 
    */
     
        // Creating a string via creating
        // object of StringBuffer class
        StringBuffer s3 = new StringBuffer("VaibhavAvhad");
 
        // Invoking reverse() method
        s3.reverse();
 
        // Returns "skeeGrofskeeG"
        System.out.println(s3);
        System.out.println("===========================");
   
   
    /* Example 5: delete( ) and deleteCharAt()

		It can delete characters within a StringBuffer by using the 
		methods delete( ) and deleteCharAt( ).The delete( ) method 
		deletes a sequence of characters from the invoking object. 
		Here, the start Index specifies the index of the 
		first character to remove, and the end Index specifies an 
		index one past the last character to remove. Thus, 
		the substring deleted runs from start Index to endIndex–1. 
		The resulting StringBuffer object is returned. 
		The   deleteCharAt( ) method deletes the character at the 
		index specified by loc. It returns the resulting 
		StringBuffer object.
		
		Syntax:
		
		StringBuffer delete(int startIndex, int endIndex)
		StringBuffer deleteCharAt(int loc)
     */
        
        StringBuffer s4 = new StringBuffer("VaibhavAvhad");
        
        s4.delete(0, 7);
        // Returns Avhad
        System.out.println(s4);
        
        /* i want to delete the specific char then by using define the 
        	perticualr index number 
        */
        s4.deleteCharAt(0);      //here i want to remove the A from Avhad
        // Returns Avhad
        System.out.println(s4);
        
        System.out.println("=========================");
        
        
        
    /* Example 6: replace()

		It can replace one set of characters with another set inside 
		a StringBuffer object by calling replace( ). 
		The substring being replaced is specified by the indexes 
		start Index and endIndex. Thus, the substring at start 
		Index through endIndex–1 is replaced. The replacement string 
		is passed in str. The resulting StringBuffer object is returned.
		
		Syntax:
		
		StringBuffer replace(int startIndex, int endIndex, String str)
	*/
        
        StringBuffer s5 = new StringBuffer("Vaibhav___Avhad");
        s5.replace(7, 10, "Hari");
 
        // Returns VaibhavHariAvhad
        System.out.println(s5);
        System.out.println("====================================");
        
        
	}	

}
