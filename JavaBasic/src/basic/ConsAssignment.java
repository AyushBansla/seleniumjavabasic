package basic;

public class ConsAssignment {

	public ConsAssignment()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	
	public ConsAssignment(int a)
	{
		this();
		System.out.println("one parameterized Cons");
	}
	
	public ConsAssignment(int a, int b)
	{
		this(1);
		System.out.println("two parameterized Cons");
	}
	
	public ConsAssignment(int a, int b, int c)
	{
		
		System.out.println("three parameterized Cons");
	}
	
	public ConsAssignment(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("four parameterized Cons");
	}
	public static void main (String[]args)
{
	ConsAssignment obj = new ConsAssignment(1,2,3,4);
}
}
