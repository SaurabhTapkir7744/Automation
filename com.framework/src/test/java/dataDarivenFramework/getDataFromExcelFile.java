package dataDarivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// create FileInputStream Object
		String path = "./src/test/resources/TestData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		// open Worbook in Read mode
		Workbook book = WorkbookFactory.create(fis);
		//get sheet  
		Sheet sheet = book.getSheet("Valid");
		//get Row
		Row row = sheet.getRow(1);
		//get Cell
		Cell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);

	}

}
