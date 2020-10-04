package oopsConcept;

public class TestStudent3 {
	
	public static void main(String[] args) {
	
		Student3 s3 = new Student3();
		
		int num1;
		num1 = 100;
		System.out.println(num1);
		
		// calling fields/instance
		System.out.println(s3.rollno);
		System.out.println(s3.studentName);
		
		//callingmetod
		s3.m3();
		
	}

}
