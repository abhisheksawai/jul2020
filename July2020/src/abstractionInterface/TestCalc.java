package abstractionInterface;

public class TestCalc extends Calculator{
	
	public void sincos()
	{
		System.out.println("sin cos method");
	}

	public void sub() {

		System.out.println("simply sub method , but not visible to client");
		
	}

	
	public static void main(String[] args) {
		
		TestCalc tc = new TestCalc();
		tc.add();
		tc.sub();
		
	}

	public void mul() {
		
	}

	public void div() {
		
	}
}
