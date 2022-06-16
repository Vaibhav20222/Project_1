package polymorphism;

public class Testclass 
{
	void method1(int a)
	{
		System.out.println("my name is vaibhav");
	}
	void method1(char b)
	{
		System.out.println("my name is not vaibhav");
	}
	
	public static void main(String[] args) 
	{
		Testclass xyz=new Testclass();
		xyz.method1('c');
		xyz.method1(5);
	}
}
