package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import io.github.bonigarcia.wdm.WebDriverManager;



public class MavenTest {
	
	public static WebDriver driver;

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MavenTest.openBrowser();
			MavenTest.search();
			
			
		}
		
		@Test
		public static void openBrowser() {
			//System.setProperty("webdriver.chrome.driver", "src/test/java/Resources/chromedriver.exe");	
			WebDriverManager.getInstance(CHROME).setup();
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

