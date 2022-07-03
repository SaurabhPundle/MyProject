package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ADVTableReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File Basic=new File("C:\\Selenium_Excel\\DataType.xlsx");
	Sheet MySheet = WorkbookFactory.create(Basic).getSheet("Sheet2");
	System.out.println("====static coding====");
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			String table = MySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(table+" | ");
		}System.out.println();
	}
	//total no of rows
	int lastRowNo = MySheet.getLastRowNum();
	int totalRows = lastRowNo;
	System.out.println();
	System.out.println("Total rows are "+totalRows);
	
	//total no of columns
	int lastCellNo = MySheet.getRow(0).getLastCellNum();
	int totalCells = lastCellNo-1;
	System.out.println("Total cells are "+totalCells);
	System.out.println();
	
	System.out.println("====Dynamic Coding====");
	
	for(int i=0;i<=totalRows;i++)
	{
		for(int j=0;j<=totalCells;j++)
		{
			String tableD = MySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(tableD+" | ");
		}System.out.println();
	}
	
	}

}
