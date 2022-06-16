package string;

public class ReverseString 
{
	 public static void main(String[] args)
	    {
	        String input = "Vaibhav Avhad";
	 
	        StringBuilder input2 = new StringBuilder();
	 
	        // append a string into StringBuilder
	        input2.append(input);
	 
	        // reverse StringBuilder
	        input2.reverse();
	 
	        // print reversed String
	        System.out.println(input2);
	        
	        String input3 = "Vaibhav Avhad";
	        char[] temparray = input3.toCharArray();
	        int left, right = 0;
	        right = temparray.length - 1;
	 
	        for (left = 0; left < right; left++, right--) {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right] = temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
	    }

}
