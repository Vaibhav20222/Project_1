package interface1;

public class Demo2 implements Demo1
{
	// interface can not contain a constructor
	//to achieve security
	// java does not support multiple inheritance, however it can be 
	// achieved with interfaces, because the class can implement multiple interfaces. 
	public void method1()
	{
		System.out.println("method1");
	}
	
	public void method2()
	{
		System.out.println("method2");
	}
	
	public static void main(String[] args) 
	{
		Demo2 xyz = new Demo2();
		xyz.method1();
		xyz.method2();
		
		System.out.println(a);
		System.out.println(Demo2.a);
		
	}
		
}
