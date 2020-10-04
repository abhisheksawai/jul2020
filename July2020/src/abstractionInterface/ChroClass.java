package abstractionInterface;

public class ChroClass implements InterFaceWeb {
	
	public void c1()
	{
		System.out.println("c1 self method chro");
	}

	public void s1() {
		System.out.println("s1 chroclass");
		
	}

	public void s2() {
		System.out.println("s2 chroclass");
		
	}

	public void w1() {
		System.out.println("w1 chroclass");
	}

	public void w2() {
		System.out.println("w2 chroclass");
	}
	
	
	public static void main(String[] args) {
		ChroClass c = new ChroClass();
		c.c1();
		c.s1();
		c.s2();
		c.w1();
		c.w2();
		System.out.println("----------");
		FireClass f = new FireClass();
		f.f1();
		f.s1();
		f.s2();
		f.w1();
		f.w2();
	}



}
