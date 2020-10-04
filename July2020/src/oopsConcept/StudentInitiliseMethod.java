package oopsConcept;

public class StudentInitiliseMethod {
	
	int rollno;
	String studentName;
	
	public void addstudent(int roll, String name)
	{
		//rollno = roll;
		//studentName = name;
		//or
		roll=rollno;
		name=studentName;
	}
	
	public void display()
	{
		System.out.println("i am in display method");
		System.out.println(rollno);
		System.out.println(studentName);
	}
	
	public static void main(String[] args) {
		
		StudentInitiliseMethod s = new StudentInitiliseMethod();
		//s.rollno=100;
		s.addstudent(100, "shishir");
		s.display();
		//initlis object through method
	}

}
