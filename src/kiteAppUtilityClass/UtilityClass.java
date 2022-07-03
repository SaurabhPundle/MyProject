package kiteAppUtilityClass;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass {

		public static String ReadDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
		{
		File Myfile = new File("C:\\Selenium_Excel\\DataType.xlsx");
	   Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("sheet4");
	   String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
		}
		
		public static void takeScreenShot(WebDriver driver) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String random = RandomString.make(4);
			File des=new File(src,"C:\\SreenShot\\testSceenShot"+random+".png");
			FileHandler.copy(src, des);
		}
}
