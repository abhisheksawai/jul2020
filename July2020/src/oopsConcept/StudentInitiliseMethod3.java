package oopsConcept;

public class StudentInitiliseMethod3 {
	
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
		System.out.println(rollno); System.out.println(studentName);
	}
	
	public static void main(String[] args) {
		
		StudentInitiliseMethod3 s = new StudentInitiliseMethod3();
		s.addstudent(100, "shishir");
		//s.display();
	}

}
