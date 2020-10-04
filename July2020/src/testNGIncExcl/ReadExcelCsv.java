package testNGIncExcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelCsv {
	
	public static void main(String[] args) throws IOException {
		
		File src=new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\julexcelreadcsvFileOnly.xlsx");  // path of fle
		
		FileInputStream fis = new FileInputStream(src); // load file
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  // load workbuk
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		String username = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Username is "+username);
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println("sh.getLastRowNum()->");
		System.out.println(sh.getLastRowNum());
		int rowcount = sh.getLastRowNum();
		
		System.out.println("sh.getFirstRowNum()->");
		System.out.println(sh.getFirstRowNum());
		
		System.out.println("sh.getRow(3).getLastCellNum()");
		System.out.println(sh.getRow(3).getLastCellNum());
		int colcount = sh.getRow(0).getLastCellNum();
		
		
		System.out.println("==========================");
		
		for(int i = 0 ; i<rowcount;i++ )
		{
			for (int j=0; j<colcount ; j++)
			{
				System.out.println("in for loop we are");
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
		
		
		
		
		
		
	}

}
