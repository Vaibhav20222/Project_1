package other;

public class String_to_Char_array 
{
	public static void main(String[] args) 
	{
		String name = "AJAJ";
		
		String rev = "";
		
		int obj1=name.length();
		
		
		char[] char1 = name.toCharArray();
		
		
		// String to Char Array 
		/*
		 * for (int i=0; i<char1.length; i++) 
		 * { System.out.print(char1[i]+ " "); }
		 */
		
		// palendrome number
		for (int i=obj1-1; i>=0; i--)
		{
			rev = rev + char1[i];
		}
		System.out.println(rev);
		
	  if(name==rev)
	  {
		  System.out.println(name + " is palendrome String.");
	  }
	  
	  else 
	  {
		System.out.println(name + " is not a palendrome String."); 
	  }
	  
	}
}
