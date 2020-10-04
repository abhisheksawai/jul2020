package abstractionInterface;

public class TestEight implements InterFaceEight {
	
	public static void main(String[] args) {
		
		TestEight t = new TestEight();
		
		t.e1();
		t.e2();
		InterFaceEight.e3();
		
		
	}

	public void e2() {
		System.out.println("e2");
	}

}
