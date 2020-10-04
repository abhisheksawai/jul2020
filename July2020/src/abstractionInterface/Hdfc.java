package abstractionInterface;

public class Hdfc implements RBI,SBI,ThirdInterFace {

	public void sbicarloan() {
		
		System.out.println("HDFC - car loan 10% | coming from sbicarloan");
		
	}

	public void rbihomeloan() {
		
		System.out.println("HDFC - home loan 9 % | coming from rbihomeload");
		
	}

	public void thirdInterface() {

		System.out.println("ThirdInterFace in hdfc");
		
	}
	
	

}
