package oopsConcept;

public class StudentInitiliseMethod2 {
	
	int rollno;
	String studentName;

	public void addstudent(int rollno, String studentName)
	{
		rollno = rollno;
		studentName = studentName;
		System.out.println(rollno);
		System.out.println(studentName);
		//100/shishir - shishir
	}
	
	public void display()
	{
		System.out.println("i am in display method"); 	System.out.println(rollno); System.out.println(studentName);
	}
	
	public static void main(String[] args) {
		
		StudentInitiliseMethod2 s = new StudentInitiliseMethod2();
		//s.rollno=100;
		s.addstudent(100, "shishir");
		//s.display();
		//initlis object through method
	}

}
