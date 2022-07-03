package collectionApplication;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.manage().window().maximize();
		
		//use findelements by using specific tagname
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(Alllinks.size());
		
//		System.out.println("==1.for loop==");
//		for(int i=0;i<=Alllinks.size()-1;i++) {
//			System.out.println(Alllinks.get(i));
//	}
		System.out.println("==2.iterator==");
		Iterator<WebElement> a = Alllinks.iterator();
		while(a.hasNext()) {
			System.out.println(a.next().getText());
		}
		System.out.println("==3.ListIterator==");
		ListIterator<WebElement> d = Alllinks.listIterator();
		while(d.hasNext()) {
			System.out.println(d.next().getText());
		}
		System.out.println("4.==For each==");
		for(WebElement f:Alllinks) {
			System.out.println(f.getText());
		}
		
	}

}
