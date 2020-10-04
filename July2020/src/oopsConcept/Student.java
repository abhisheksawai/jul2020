package oopsConcept;

public class Student {
	
	//fields are like - 
	int rollno;
	String studentName;
	
	//Student s1 = new Student();
	
	public static void main(String[] args) {
		
		int anotherRoll;
		// how to create a object
		//for now as below - 
		//classname objectname/objectreference = new classname();
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		
		//System.out.println(anotherRoll);
		//System.out.println(rollno);
		System.out.println(s.rollno);
		
	}

}
