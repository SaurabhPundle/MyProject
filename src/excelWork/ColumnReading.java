package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ColumnReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Basic=new File("C:\\Selenium_Excel\\DataType.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Basic).getSheet("sheet2");
		
		//column reading-->static coding
		for(int i=0;i<=2;i++)
		{
			String Col = Mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Col);
		}
		//dynamic coding
		int lastRowNo = Mysheet.getLastRowNum();
		int totalRowNo = lastRowNo;
		System.out.println(totalRowNo);
		
		short lastCellNo = Mysheet.getRow(0).getLastCellNum();
		int totalCellNo = lastCellNo-1;
		System.out.println(totalCellNo);
		//to read value in cell-->cellindex(0) and row should change values
		for(int i=0;i<=totalRowNo;i++)
		{
			String colD = Mysheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(colD);
		}
		
		
		
		
		
	}

}
