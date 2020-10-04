package polyMorphism;

public class BadChild extends GoodFather {
	
	public void passout()
	{
		System.out.println(" iam done with college now");
	}
	
	public void marriage()
	{
		System.out.println(" will do with GirlFriedn");
	}
	
	public static void main(String[] args) {
		
		
		BadChild bd = new BadChild();
		bd.Twobhk();
		bd.gold();
		bd.passout();
		bd.marriage();
		
	}

}
