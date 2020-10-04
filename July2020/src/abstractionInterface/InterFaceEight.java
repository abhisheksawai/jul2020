package abstractionInterface;

public interface InterFaceEight {
	
	
	 default void e1()
	{
		System.out.println("e1 default it should");
	}
	
	public void e2();
	
	static void e3()
	{
		System.out.println("static void e3");
	}
	
}
