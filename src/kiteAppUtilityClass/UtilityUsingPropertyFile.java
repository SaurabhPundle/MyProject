package kiteAppUtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile {
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
		File destination = new File("C:\\SreenShot\\SP"+random+".png");
		
		FileHandler.copy(source, destination);
	}
	public static String ReadDatafromProperties(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myPropFile=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\My_Selenium\\myStorage.properies");
		prop.load(myPropFile);
		String value = prop.getProperty(key);
		return value;
	}

}
