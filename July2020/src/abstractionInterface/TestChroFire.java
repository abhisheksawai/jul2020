package abstractionInterface;

public class TestChroFire {
	
	public void test()
	{
		System.out.println("test");
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
		
		
		TestChroFire tcf = new TestChroFire();
		tcf.test();
		
		InterFaceSearch c2 = new ChroClass();
		c2.s1();
		
		
		InterFaceWeb 	c3 = new ChroClass();
		c3.s1();
		c3.w1();
		//c3.c1();
		
	//	ChroClass 	c4 = new InterFaceSearch();
		
	}

}
