package utilityClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.util.DateFormatConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApiTest {

	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String SheetPath;

	public ExcelApiTest(String SheetPath) throws Exception {

		fis = new FileInputStream(SheetPath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}

	public int rowCount(String SheetName) {
		sheet = workbook.getSheet(SheetName);
		int noOfRows = sheet.getLastRowNum() + 1;
		System.out.println("No of rows present in the sheet is : " + noOfRows);

		return noOfRows;
	}

	public int colCount(String SheetName) {
		sheet = workbook.getSheet(SheetName);
		row = sheet.getRow(0);
		int noOfCell = row.getLastCellNum();

		System.out.println("No of columns present in the sheet is : " + noOfCell);

		return noOfCell;
	}

	public String getCellData(String SheetName, int rowNum, int colNum) {

		try {
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);

			if (cell.getCellTypeEnum() == CellType.STRING)
				return cell.getStringCellValue();

			else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {

				String cellvalue = String.valueOf(cell.getNumericCellValue());

				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat df = new SimpleDateFormat("dd/mm/yy");
					Date date = cell.getDateCellValue();
					cellvalue = df.format(date);
				}
				return cellvalue;

			} else if (cell.getCellTypeEnum() == CellType.BLANK)

				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {
			e.printStackTrace();

			return "Either row num " + rowNum + "column no " + colNum + " are not present in the sheet is : "
					+ SheetName;
		}

	}

	public boolean setCelldata(String SheetName, int rowNum, int colNum, String value) {

		try{
			
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			
			if(row == null){
				row = sheet.createRow(rowNum);
			}
			
			cell = row.getCell(colNum);
			
			if(cell == null){
				
				cell = row.createCell(colNum);
			}
			
			cell.setCellValue(value);
			
			fos = new FileOutputStream(SheetPath);
			workbook.write(fos);
			fos.close();
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
