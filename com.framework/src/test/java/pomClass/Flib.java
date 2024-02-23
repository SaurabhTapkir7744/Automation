package pomClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// GetDataFrom property File
	public String getDataFromPropertyFile(String Path, String Key) throws IOException {

		FileInputStream fis = new FileInputStream(Path);
		Properties prop = new Properties();
		prop.load(fis);
		String Value = prop.getProperty(Key);
		return Value;
	}

	// Get Data From ExcelFile
	public String getDataFromExcelFile(String path, String SheetName, int RowNum, int CellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(SheetName);
		Row row = sheet.getRow(RowNum);
		Cell cell = row.getCell(CellNum);
		String data = cell.getStringCellValue();
		return data;

	}

	// Count Last Row:
	public static int getLastRowCount(String path, String SheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(SheetName);
		int count = sheet.getLastRowNum();
		return count;
	}

}
