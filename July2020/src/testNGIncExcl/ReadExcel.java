package testNGIncExcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		File src=new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\julexcelread.xlsx");  // path of fle
		
		FileInputStream fis = new FileInputStream(src); // load file
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  // load workbuk
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println("sh.getLastRowNum()->");
		System.out.println(sh.getLastRowNum());
		
		System.out.println("sh.getLastRowNum()->");
		System.out.println(sh.getLastRowNum());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
