package polymorphism;

public class Poly_program 
{
	static void method1(int a)
	{
		System.out.println("method1 with int arg");
	}
	static void method1(char v)
	{
		System.out.println("methodwith char arg");
	}
	
	public static void main(String[] args) {
		
		method1(20);
	}
}
