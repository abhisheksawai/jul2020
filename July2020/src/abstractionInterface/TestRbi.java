package abstractionInterface;

public class TestRbi implements RBI{

	public void homeloan() {
		
		System.out.println("9%");
		
	}
	
	public static void main(String[] args) {
		
		TestRbi tr = new TestRbi();
		tr.homeloan();
		
	}
	

}
