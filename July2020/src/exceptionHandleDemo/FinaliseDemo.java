package exceptionHandleDemo;

public class FinaliseDemo {
	
	public void finalize()
	{
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		
		FinaliseDemo f1 = new FinaliseDemo();
		FinaliseDemo f2 = new FinaliseDemo();
		
		f1=null;
		f2=null;
		
		System.gc();
		
	}

}
