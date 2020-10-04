package collectionDemo;

public class InstanceOfOp {
	
	public static void main(String[] args) {
		
		Student s = new Student(10, "a");
		Empinstance e = new Empinstance();
		
		System.out.println(s instanceof Student);
		Empinstance e1 = null;
		System.out.println(e1 instanceof Empinstance);
		
	}

}
