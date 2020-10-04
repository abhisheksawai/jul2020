package keyWordsDemo;

public class StudentInitilise {
	
	int rollno;
	String studentName;
	
	
	public static void main(String[] args) {
		
		StudentInitilise s = new StudentInitilise();
		
		System.out.println(s.rollno);
		System.out.println(s.studentName);
		System.out.println("will initilise object");
		s.rollno = 100;
		s.studentName = "Abhishek";
		
		System.out.println(s.rollno);
		System.out.println(s.studentName);
		
		StudentInitilise s1 = new StudentInitilise();
		s1.rollno=101;
		s1.studentName="Alind";
		
		System.out.println(s1.rollno);
		System.out.println(s1.studentName);
		
		
		//initlis object through method
		
	}

}
