package oopsConcept;


public class StudentParaConst {
	
	int roll;
	String name;
	
	public void foo()
	{
		System.out.println("foo method");
	}
	
	public StudentParaConst(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
	public void displayParaConst()
	{
		System.out.println("roll is "+roll+" and name is "+name);
	}

	public static void main(String[] args) {
		
		StudentParaConst sc = new StudentParaConst(100, "Abhishek");
		sc.foo();
		sc.displayParaConst();
	}

}
