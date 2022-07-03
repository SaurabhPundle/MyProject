package excelWork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTableRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Basic=new File("C:\\Selenium_Excel\\DataType.xlsx");
		//for numeric 
		double AT00 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.print(AT00+"    ");
		double AT01 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
        System.out.print(AT01+"    ");
        double AT02 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
        System.out.println(AT02+"    ");
        
        //for String 
        String AT10 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.print(AT10+"     ");
        String AT11 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.print(AT11+"    ");
        String AT12 = WorkbookFactory.create(Basic).getSheet("Sheet1").getRow(1).getCell(02).getStringCellValue();
        System.out.println(AT12+"    ");
        
        //for boolean
        boolean AT20 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(2).getCell(0).getBooleanCellValue();
        System.out.print(AT20+"    ");
        boolean AT21 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(2).getCell(1).getBooleanCellValue();
        System.out.print(AT21+"   ");
        boolean AT22 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(2).getCell(2).getBooleanCellValue();
        System.out.println(AT22+"    ");
        
        //for Char
        String AT30 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
        System.out.print(AT30+"       ");
        String AT31 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(3).getCell(1).getStringCellValue();
        System.out.print(AT31+"        ");
        String AT32 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(3).getCell(2).getStringCellValue();
        System.out.println(AT32+"       ");
        
        //for String+Special+numbers
        String AT40 = WorkbookFactory.create(Basic).getSheet("sheet1").getRow(4).getCell(0).getStringCellValue();
        System.out.println(AT40);
        
        
        


	}

}
