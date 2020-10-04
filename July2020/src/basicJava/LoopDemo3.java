package basicJava;

public class LoopDemo3 {
	
	public static void main(String[] args) {
		
		int no;
		//initialise;condition;increment
		for(no=1;no<=10;no++)
		{
			System.out.print("value of no is "+no);
		}
		System.out.println("----");
		for (no = 2 ; no<=10; no=no+2)
		{
			System.out.println("mahesh sri "+no);
		}
		
		System.out.println("----");
		for (no = 1 ; no<=10; no=no+2)
		{
			System.out.println("odd mahesh sri "+no);
		}
		
		System.out.println("from praj");
		for( no=1;no<=10;no++)
		  {
		   
		   if (no % 2 != 0) {
			   
			   System.out.println("no "+no);
		    
		      }
		  }
	}

}
