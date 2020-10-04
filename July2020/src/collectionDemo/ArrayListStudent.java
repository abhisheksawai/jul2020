package collectionDemo;

import java.util.ArrayList;

public class ArrayListStudent {
	
	public static void main(String[] args) {  
		
		ArrayList a2 = new ArrayList();
		a2.add(new Student(10,"abhishek"));
		a2.add(new Student(12,"alind"));
		a2.add(new Student(13,"shishr"));
	//	a2.add(new Empinstance(83483, "abhishek", 20000);
		a2.add( new Empinstance(10, "shishir", 20000));
		
		System.out.println(a2);
		
		for(Object ob : a2)
		{
			if(ob instanceof Student)
			{
				//System.out.println(ob);
				Student s = (Student) ob;
				System.out.println(s.rollno);
				System.out.println(s.name);
			}
			//System.out.println("---");
			if(ob instanceof Empinstance)
			{
				Empinstance e = (Empinstance) ob;
				System.out.println(e.empno);
				System.out.println(e.empname);
				System.out.println(e.salary);
			}
		}
		
		
	}

}
