package exceptionHandleDemo;

public class ExceptionHandle2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("welcome all");
		
		int number;
		
		
		try {
			number = 100/0;  //logically we are wrong here
			System.out.println(number);
					
		}

		finally
		{
			System.out.println("finally code is going to execute");
		}
		
		System.out.println("remaininig code1");
		System.out.println("remaininig code2");
		
		
	}

}
