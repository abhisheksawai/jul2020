package exceptionHandleDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrows2 {
	
	public static void main(String[] args)    {
		
		
		System.out.println("welcome all");
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\java\\Exceptions\\Exception Handaling .docx");
		try {
			FileInputStream fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("remaininig code1");
		System.out.println("remaininig code2");
		
		
	}

}
