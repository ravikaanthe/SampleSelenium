package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class MavenTest {
	
	public static WebDriver driver;

		@Test
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Logging inot the account");
			
		}
		
		@Test
		public static void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:/Selenium Automation/Driver/chromedriver_win32_80/chromedriver.exe");	
			
			driver=new ChromeDriver();
					
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://google.com");
			
			
			//Constant Variable is used in place of URL
			//As it was declared as 'static', it can be used by referring the class name
			//Type the class name 'Constants' and press '.' dot, it will display all the memebers of the class Constants

		}
		
		@Test
		public static void search() {
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Automation");
			driver.findElement(By.xpath("//input[@name='btnK']")).click();
			driver.quit();
		}
		
		

	}

