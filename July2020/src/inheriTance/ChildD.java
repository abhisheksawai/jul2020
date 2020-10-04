package inheriTance;

public class ChildD extends ParentP {
	
	public void sportbike()
	{
		System.out.println("sportbike");
	}
	
	
	public static void main(String[] args) {
		
		ChildD c = new ChildD();
		System.out.println("into child d class");
		c.sportbike();	
		c.Twobhk();
		c.car();
	}

}
