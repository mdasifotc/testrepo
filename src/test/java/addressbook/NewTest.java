package addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class NewTest {
	WebDriver driver;  
		@BeforeMethod
		public void launch() {
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\Aliya_Uzma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://3.12.34.236:32768/addressbook/");
		
		}
		
	  @Test
	  public void verfiy() throws InterruptedException {
		 
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		  driver.findElement(By.id("gwt-uid-5")).sendKeys("Mohammed");
		  driver.findElement(By.id("gwt-uid-7")).sendKeys("Asif");
		  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("11/11/1988");
		  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		  Thread.sleep(3000);
	  }
	  
	  @AfterMethod
	  public void close() {
		  driver.close();
}
}