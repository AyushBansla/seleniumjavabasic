package basic;

public class Student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all");
		
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}	
	public static void main (String[]args)
	{
		Student Ayush= new Student();
		Ayush.age=18;
		System.out.println("Student age is" + Ayush.age);
		Ayush.rollno=1;
		System.out.println("Student rollno is" + Ayush.rollno);
		Ayush.display1();
		Ayush.display2();
	}

}
