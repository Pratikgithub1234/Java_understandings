
public class MyClass11
{
	static
	{
		System.out.println("in MyClass11 first static initializer");
	}
	public static void main(String args[])
	{
		System.out.println("in main");		
	}
	
	static
	{
		System.out.println("in MyClass11 second static initializer");
	}
}
class A
{
	static
	{
		System.out.println("in A first static initializer");
	}
}


//only the static blocks of the class with main function will be called