package exceptionHandleDemo;

public class ThrowKeyword {
	
	static void validate(int age)
	{  
	     if(age<18)  
	     {
	    	 throw new ArithmeticException("not valid age for abc");
	     }
	     else
	     {
	    	 System.out.println("valid age for abc");
	     }
	}
	    	 
	public static void main(String[] args) {
		
		validate(10);
		
	}

}
