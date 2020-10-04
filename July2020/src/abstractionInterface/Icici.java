package abstractionInterface;

public class Icici implements RBI,SBI,ThirdInterFace {

	public void sbicarloan() {
		
		System.out.println("Icici - car loan 10% | coming from sbicarloan");
	}

	public void rbihomeloan() {
		
		System.out.println("Icici - home loan 9 % | coming from rbihomeload");
	}

	public void thirdInterface() {
		
		System.out.println("ThirdInterFace in icici");
		
	}
	
	
	

}
