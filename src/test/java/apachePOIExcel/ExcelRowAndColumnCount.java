package apachePOIExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRowAndColumnCount {

	public static void main(String[] args) throws Exception {
			
		FileInputStream fis = new FileInputStream("G:/Workspace2/JenkinsTest/src/test/java/apachePOIExcel/TestDataS.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Credentials");
		XSSFRow row = sheet.getRow(0);
		
		int colCount = row.getLastCellNum();
		
		System.out.println("Total no of columns present in the sheet is : "+colCount);
		
		int rowCount = sheet.getLastRowNum()+1;
		System.out.println("Total no of rows present in the sheet is : "+rowCount);
	}

}
