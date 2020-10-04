package basicJava;


public class SwitchDemo {
	
	public static void main(String[] args) {
		
		int number= 1320;
		
		switch(number)
		{
		case 90: 
			System.out.println("case 90");break;
		case 10: 
			System.out.println("case 10 for addition"); 
			System.out.println(number+number);break;
		case 20: 
			System.out.println("case 20 for sub");
			System.out.println(number-9);
			break;
		case 30: 
			System.out.println("case 30");break;
		case 40: 
			System.out.println("case 40");break;
		 default:
			System.out.println("not matching any case hence executing default");
				
		
		}
		
	}

}
