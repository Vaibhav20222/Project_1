package poly_1;

public class Main
{
	public static void main(String[] args) 
	{
		Animal myAnimal = new Animal(); //obj creation
		myAnimal.animalSound();
		
		Animal myPig = new CPig(); //obj creation
		myPig.animalSound();
		
		Animal myDog = new Dog(); //obj creation
		myDog.animalSound();
	}
}