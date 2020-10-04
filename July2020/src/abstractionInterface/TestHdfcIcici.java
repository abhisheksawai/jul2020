package abstractionInterface;

public class TestHdfcIcici {
	
	public static void main(String[] args) {
		
		Hdfc h = new Hdfc();
		Icici i = new Icici();
		
		h.rbihomeloan();
		h.sbicarloan();
		h.thirdInterface();
		System.out.println("-----------");
		i.sbicarloan();
		i.rbihomeloan();
		i.thirdInterface();	
		
	}

}
