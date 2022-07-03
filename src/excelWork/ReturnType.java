package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReturnType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File Basic=new File("C:\\Selenium_Excel\\DataType.xlsx");
	Workbook book = WorkbookFactory.create(Basic);
	Sheet sheet = book.getSheet("sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	double num = cell.getNumericCellValue();
	System.out.println(num);
	}

}
