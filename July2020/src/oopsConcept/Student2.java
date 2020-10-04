package oopsConcept;

public class Student2 {
	
	//fields are like - 
	int rollno;
	String studentName;
	
	public void m1()
	{
		System.out.println("method m1");
		// i might need this code again and again and consider here 100 line of code
	}
	
	public static void main(String[] args) {
		
		Student2 s = new Student2();
		System.out.println(s.rollno);
		System.out.println(s.studentName);
		s.m1();		
		//how to call method
		//objetname.methodname()
		
	}

}
