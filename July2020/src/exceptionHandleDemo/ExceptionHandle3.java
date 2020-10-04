package exceptionHandleDemo;

public class ExceptionHandle3 {
	
	public static void main(String[] args) {
		
		
		System.out.println("welcome all");
		
		int number;
		
		
		try {
			number = 100/0;  //logically we are wrong here
			System.out.println(number);
					
		}
		catch(ArithmeticException e )
		{
			System.out.println("exception  i am getting is "+e);
		}
		
		finally
		{
			System.out.println("finally code is going to execute");
		}
		
		System.out.println("remaininig code1");
		System.out.println("remaininig code2");
		
		
	}

}
