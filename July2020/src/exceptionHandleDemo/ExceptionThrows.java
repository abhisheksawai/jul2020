package exceptionHandleDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrows {
	
	public static void main(String[] args)  {
		
		
		System.out.println("welcome all");
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\java\\Exceptions\\Exception Handaling .docx");
		FileInputStream fis = new FileInputStream(src);
		
		
		System.out.println("remaininig code1");
		System.out.println("remaininig code2");
		
		// diff between try catch and throw
	}

}
