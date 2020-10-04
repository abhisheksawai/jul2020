package oopsConcept;

public class StudenMethodThis {
	
	int rollno;
	String studentName;

	public void addstudent(int rollno, String studentName)
	{
		this.rollno = rollno;
		this.studentName = studentName;
		
	}
	
	public void display()
	{
		System.out.println("printing from ddispaly");
		System.out.println(rollno); System.out.println(studentName);
	}
	
	public static void main(String[] args) {
		
		StudenMethodThis s = new StudenMethodThis();
		s.addstudent(100, "alind");
		s.display();
		System.out.println("-----printin from main");
		System.out.println(s.rollno); 
		System.out.println(s.studentName);
		//s.display();
	}

}
