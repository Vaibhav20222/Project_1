package string;

public class String001 
{
	public static void main(String[] args) 
	{
		//by using string
		
//		String s="abcde";
//		int len=s.length();
//		int m=0;
//		
//		while(m<len) 
//		{
//			for(int i=0;i<len;i++) 
//			{
//				for(int j=m;j<=i;j++) 
//				{
//			
//				System.out.print(s.charAt(j));
//				}
//				
//				if(m<=i) 
//				{
//				System.out.println();
//		        }
//		    }
//		    m++;
//		}
//	}
	
	
	//by using array
		
	String[] s = {"a", "b", "c", "d", "e"};
	int len=s.length;
	int m=0;
	
	while(m<len) 
	{
		for(int i=0;i<len;i++) 
		{
			for(int j=m;j<=i;j++) 
			{
		
			System.out.print(s[j]);
			}
			
			if(m<=i) 
			{
			System.out.println();
	        }
	   }
	    m++;
	}
  }
}
