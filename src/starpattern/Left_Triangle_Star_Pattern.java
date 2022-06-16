package starpattern;

public class Left_Triangle_Star_Pattern 
{
	public static void main(String[] args) 
	{
		
		 int i,j, row=6;
		
		//loop for rowa
		for(i=0; i<row; i++)
		{
			//loop for spaces
			for(j=2*(row-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			
			//loop for columns
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		} 
	}
}
