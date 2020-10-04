package oopsConcept;

public class StudentInitiliseMethod5 {
	
	int rollno;
	String studentName;

	public void addstudent(int rollno, String studentName)
	{
		
		// we are confusing to complier which rollno is which one ...
		s.rollno = rollno;
		s.studentName = studentName;
		System.out.println(rollno);
		System.out.println(studentName);
		//100/shishir - shishir
	}
	
	public void display(int rollno, String studentName)
	{
		System.out.println(rollno); System.out.println(studentName);
	}
	
	public static void main(String[] args) {
		
		StudentInitiliseMethod5 s = new StudentInitiliseMethod5();
		s.addstudent(100, "shishir");
		s.display(200, "praj");
		System.out.println("-----");
		System.out.println(s.rollno); 
		System.out.println(s.studentName);
		//s.display();
	}

}
