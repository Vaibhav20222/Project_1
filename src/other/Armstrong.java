package other;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=157;
		int num1=157;
		int x;

		int a=0;//27, 27+5^3+1^1
		
		while(num!=0)
			{
				x=num%10;//15, 1
				num=num/10;
				a=a+(x*x*x);
			}
		if(num1==a)
		{
			System.out.println(a+ " it is armstrong number");
		}
		else
		{
			System.out.println(num1+ " it is not a armstrong number");
		}
	}
}