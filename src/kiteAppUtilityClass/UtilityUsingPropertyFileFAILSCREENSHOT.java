package kiteAppUtilityClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityUsingPropertyFileFAILSCREENSHOT {
	
	public static String ReadDatafromProperties(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myPropFile=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\My_Selenium\\myStorage.properies");
		prop.load(myPropFile);
		String value = prop.getProperty(key);
		return value;
	}

}
