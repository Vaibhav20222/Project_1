package starpattern;

public class Diamond_Shape_Star_Pattern 
{
	
	public static void main(String[] args) 
	{
		
		/*
		//by using for loop
		int row=6;
		int i, j;
		
		//outer loop 1
		//1st half diamond shape
		for(i=1; i<= row; i++)
		{
			//inner loop 1
			for(j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			
		//inner loop 2
		for(j=1; j<=i*2-1; j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		}
		
		//outer loop 2
		//2nd half of diamond
		for(i=row-1; i>0; i--)
		{
			//inner loop for spaces
			for(j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			
			//inner loop 2 
			for(j=1; j<=i*2-1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		
		//by using while loop
		int row = 6;
		
		//single star in 1st row
		int i=1;
		//for column 
		int j;
		
		// ==> Outer loop 1
        // Prints the first half diamond
		while(i<=row)
		{
			j=1;
			
			//inner loop 1
			//Prints space until n++ <= number - m is false
			while(j++<=row-i)
			{
				System.out.print(" ");
			}
			
			j=1;
			
			//inner loop 2
			//Prints star until n++ <= m * 2 - 1 is false
			while(j++ <= i*2-1)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			// Incrementing as we want pyramid generation
			i++;
		}
		
		// Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable t be
        // initialized should one lesser than number
		i=row-1;
		
		// ==> outer loop 2
		// Prints the second half diamond
		while(i>0)
		{
			j=1;
			
			// inner loop 1
			// Prints spaces until n++ <= number - m is false
			while(j++ <= row-i)
			{
				System.out.print(" ");
			}
			
			j=1;
			
			// inner loop 2
			// Prints star until n++ <= m * 2 - 1 is false
			while(j++ <= i*2-1)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			// Decrementing as we want reverse pyramid generation
			i--;
		}
		
	}

}
