package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.findElement(By.xpath("//div[@class='_6ltg']/a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 

		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Baba");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ranchod");
		 
		 
		 
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("836767");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@123");
		 
		 
		//create objs and select for dropdown
		 

		 Select obj = new Select(driver.findElement(By.id("day")));
		 obj.selectByIndex(1);
		 Select obj2 = new Select(driver.findElement(By.id("month")));
		 obj2.selectByIndex(3);
		 Select obj3 = new Select(driver.findElement(By.id("year")));
		 obj3.selectByIndex(2);
		 
		 driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		 
		 driver.close();
		 
		 
		 
		 
		 
		 
	}

}
