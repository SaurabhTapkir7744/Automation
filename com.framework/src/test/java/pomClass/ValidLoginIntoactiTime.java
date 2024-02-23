package pomClass;

import java.io.IOException;

public class ValidLoginIntoactiTime extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest test=new BaseTest();
		test.setup();
		
		LoginPage lp=new LoginPage(driver);
		Flib lib =new Flib();
//		lp.loginIntoActitime(lib.getDataFromExcelFile( ExcelPath,SheetName ,1, 0), 
//				lib.getDataFromExcelFile( ExcelPath,SheetName ,1, 1));
		
		
	}

}
