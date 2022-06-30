package basic;

public class Multi 
{
	public int sum(int a,int b)
	{
	 int c;
	 c=a+b;
	 System.out.println("sum result is "+c);
	 return c;	
	}
	
	public int sub(int x,int y)
	{
	 int z;
	 z=x-y;
	 System.out.println("sub result is"+z);
	 return z;	
	}
	
	public int multi(int x1,int x2)
	{
	 int x3;
	 x3=x1*x2;
	 System.out.println("multi result is "+ x3);
	 return x3;	
	}
	
	public static void main (String[]args)
	{
		Multi Ob= new Multi();
		int Sumresult=Ob.sum(10, 2);
		int Subresult=Ob.sub(10, 2);
		Ob.multi(Sumresult,Subresult);
	}

}
