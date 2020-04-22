package utilityClasses;

public class TestExcelApiMethods {

	public static void main(String[] args) throws Exception {
		ExcelApiTest eat = new ExcelApiTest("G:/Workspace2/JenkinsTest/src/test/java/apachePOIExcel/TestDataS.xlsx");
		eat.rowCount("Credentials");
		eat.colCount("Credentials");
		// retrieving data from the sheet based on row and coloumn
		System.out.println(eat.getCellData("Credentials", 2, 0));
		/*System.out.println(eat.getCellData("Credentials", 2, 1));
		System.out.println(eat.getCellData("Credentials", 2, 2));
		System.out.println(eat.getCellData("Credentials", 2, 3));
		System.out.println(eat.getCellData("Credentials", 2, 4));
		System.out.println("***********************************");*/
		
		System.out.println("Seting the data as : "+eat.setCelldata("Credentials", 2, 4, "true"));
		
		
	}

}
