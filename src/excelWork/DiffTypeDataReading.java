package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DiffTypeDataReading{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Selenium_Excel\\DataType.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		//we require total table data type and different values by dynamic coding
		
		int totalRows = mysheet.getLastRowNum();
		System.out.println("rows "+totalRows);
		int totalCells = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("cells "+totalCells);
		
		for(int i=0;i<=totalRows;i++)
		{
			for(int j=0;j<=totalCells;j++)
			{
				Cell cell = mysheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(cell.getStringCellValue()+"   ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+"   ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(cell.getBooleanCellValue()+"   ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print("null"+"  ");
				}
			}System.out.println();
	}
		
	}
}

