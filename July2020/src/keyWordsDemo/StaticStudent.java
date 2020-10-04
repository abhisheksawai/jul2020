package keyWordsDemo;

public class StaticStudent {
	
	int rollno;
	String studentName;
	static String collegeName = "AbCollege";
	
	public void displayData()
	{
		System.out.println("roll  "+ rollno);
		System.out.println("name "+ studentName);
		System.out.println("coll name is "+ collegeName);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		
		StaticStudent s = new StaticStudent();
		s.rollno=103;
		s.studentName = "shishir";
		
		StaticStudent s1 = new StaticStudent();
		s1.rollno=101;
		s1.studentName="Alind";
		
		
		s.displayData();
		s1.displayData();
		
	}

}
