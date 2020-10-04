package exceptionHandleDemo;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		
		System.out.println("welcome all");
		
		int number;
		
		
		try {
			number = 100/0;  //logically we are wrong here
			System.out.println(number);
			
			
			
			// add code
			
			
			
			
					
		}catch(ArithmeticException e )
		{
			System.out.println("exception  i am getting is "+e);
		}
		
		
		System.out.println("remaininig code1");
		System.out.println("remaininig code2");
		
		
	}

}
