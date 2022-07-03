package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Basic=new File("C:\\Selenium_Excel\\DataType.xlsx");
		Sheet sheet2 = WorkbookFactory.create(Basic).getSheet("Sheet2");
		//Read one row-->static coding
		for(int i=0;i<=2;i++)
		{
			String row1 = sheet2.getRow(0).getCell(i).getStringCellValue();
			System.out.print(row1+"  ");
		}
		System.out.println();
		//read one row-->Dynamic coding
		int lastRowNo = sheet2.getLastRowNum();
		int totalrows = lastRowNo;
		System.out.println(totalrows);     //row starts count from 0
		
		short lastcellno = sheet2.getRow(0).getLastCellNum();
		int totalcell = lastcellno-1;
		System.out.println(totalcell);    //cell starts count from 1
		//to read value in rows-->Rows value is fix (0) and column value changes
		for(int i=0;i<=totalcell;i++)
		{
			String rowD = sheet2.getRow(1).getCell(i).getStringCellValue();
			System.out.print(rowD+"  ");
		}

	}

}
