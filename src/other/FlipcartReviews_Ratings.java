package other;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartReviews_Ratings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("onepluse smartphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		 WebElement Ratings = driver.findElement(By.xpath("(((//div[@class='col col-7-12'])[1]//div)[2]//span)[4]"));
		System.out.println(Ratings.getText());
		Thread.sleep(2000);
		WebElement Reviews = driver.findElement(By.xpath("(((//div[@class='col col-7-12'])[1]//div)[2]//span)[6]"));
		System.out.println(Reviews.getText());
	}

}
