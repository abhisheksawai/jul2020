package abstractionInterface;

public class TestHome implements InterFaceHome {

	public void sofa() {
		System.out.println("sofa");
	}
	public int countofChair() {
		System.out.println("count of chair sofa");
		return 0;
	}

	public void AC() {
		System.out.println("ac");	
	}

	public int countofAC() {
		System.out.println("count of ac");
		return 0;
	}
	
	public static void main(String[] args) {
		TestHome th = new TestHome();
		th.AC();
		th.sofa();
		th.countofAC();
		th.countofChair();
	}

}
