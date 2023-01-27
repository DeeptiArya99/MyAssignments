package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.findElement(By.xpath("//div[@class='fl search-box clearfix']/div/input")).sendKeys("Chennai");
		 driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@data-id=\"123\"]")).click();

		 driver.findElement(By.xpath("//div[@class='fl search-box']/div/input")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@data-id=\"122\"]")).click();
		 
		 driver.findElement(By.xpath("//label[text()='Date']")).click();
		 
		 String date = "27";
		 
		 driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
		 
		 driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		 
		 //print no of buses
		 
		 String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	     System.out.println(text);
	     
	     driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
	     
	     //print name of second bus
	     
	     System.out.println(driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText());
	     
			driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
			driver.close();
	     
		 
		 
		 
		 
		 
		 
		 
	}

}
