package collectionDemo;

import java.util.ArrayList;

public class ArrayListStudent2 {
	
	public static void main(String[] args) {  
		
		ArrayList a2 = new ArrayList();
		a2.add(new Student(10,"abhishek"));
		a2.add(new Student(12,"alind"));
		a2.add(new Student(13,"shishr"));
		a2.add( new Empinstance(10, "shishir", 20000));
		
		ArrayList<Student> a3 = new ArrayList<Student>();
		a3.add(new Student(133,"shishr0"));
		a3.add(new Student(14,"shishr1"));
		a3.add(new Student(155,"shishr2"));
	//	a3.add( new Empinstance(10, "shishir1", 20000));
		
		
	//	System.out.println(a2);
		
		for(Student ob : a3)
		{
				Student s = (Student) ob;
				System.out.println(s.rollno);
				System.out.println(s.name);
			}
		}
		
	}

