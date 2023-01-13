package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafromExcel {
	@Test
	public void ReadExcel() throws IOException {

     FileInputStream fis = new FileInputStream("C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\Employee.xlsx");
     
     XSSFWorkbook workbook = new XSSFWorkbook(fis);
     
     XSSFSheet sheet = workbook.getSheet("emp");
     
     System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
     System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	}

}
