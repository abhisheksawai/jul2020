package abstractionInterface;

public class TestMobile {
	
	public static void main(String[] args) {
		
		Nokia n = new Nokia();
		Apple a = new Apple();
		
		System.out.println(n.simcount());
		System.out.println(a.simcount());
		
		
	}

}
