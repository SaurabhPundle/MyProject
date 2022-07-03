package popUpStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserORWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(id);
		
		System.out.println("==iterator use==");//for multiple tabs changing sequence
	     Iterator<String> b = al.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		System.out.println("==listIerator use==");//for multiple tabs changing sequence
		ListIterator<String> c = al.listIterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("==forloop use==");//for multiple tabs changing sequence
        for(int i=0;i<=al.size()-1;i++) {
        	System.out.println(al.get(i));
        }
        System.out.println("==for each loop==");//for multiple tabs changing sequence
		for(String d:al) {
			System.out.println(d);
		}
		
		System.out.println("==conventional==");//for display window id
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		Thread.sleep(1000);
		driver.switchTo().window(al.get(1));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Happy");
		driver.close();
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(100);
		
		driver.quit();
		
		
		

	}

}
