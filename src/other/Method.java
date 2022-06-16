package other;

public class Method 
{
	static int a =20;
	int b=30;
	int c=80;
	static void method1() // static method
	{
		System.out.println("static method");
	}

	void demo()
		{
			System.out.println("Non static method"); //Non static method
		}
	public static void main(String[] args)
		{ 
		//Static and non Static calling inside the class
		System.out.println(a);
		System.out.println(Method.a);// static element calling
		
		Method t1= new Method();//object
		System.out.println(t1.b);
		System.out.println(t1.c);// Non-static element calling
		
		System.out.println();
		method1();

		Method t3=new Method();
		t3.demo();
		
		}
}
