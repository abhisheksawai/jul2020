package inheriTance;

public class ChildC extends ParentP {
	
	public void threebhk()
	{
		System.out.println("3 bhk");
		
	}
	
	public void c1()
	{
		System.out.println("c1 method from child");
	}
	
	
	public static void main(String[] args) {
		
		ChildC c = new ChildC();
		System.out.println("into child c class");
		c.threebhk();	
		c.Twobhk();
		c.gold();
		c.marriage();
		c.car();
		
		
		
		//c.primethod();
	}

}
