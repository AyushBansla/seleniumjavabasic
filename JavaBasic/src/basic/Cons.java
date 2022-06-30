package basic;

public class Cons
{
	
	public void m1()
	{
		System.out.println("First Method");
		this.m2();
	}
	public void m2()
	{
		System.out.println("Second Method");
		this.m3();
	}
	public void m3()
	{
		System.out.println("Third Method");
		this.m4();
	}
	public void m4()
	{
		System.out.println("4th Method");
	}
	public static void main (String[]args)
	{
		 Cons Ob= new Cons();
		 Ob.m1();
	}

}
