package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://in.bookmyshow.com/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//li[@class='sc-gJqsIT jMjMYb']")).click();
		 
		 String city = driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']")).getText();
		 if(city.equalsIgnoreCase("Hyderabad"))
		 {
			 System.out.println("URL IS loaded with city name");
		 
		 }
		 driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Pathaan");
		 driver.findElement(By.xpath("//div[@class='sc-dXfzlN iPwaRU']")).click();
		 //issue here
		 
		 driver.findElement(By.xpath("//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT']/span[1]")).click(); //book tickets
		 
		 driver.findElement(By.xpath("//div[@class='sc-vhz3gb-3 dRokFO']/span[1]")).click(); //2D
		 
		 String cinemahall = driver.findElement(By.xpath("//a[@class='__venue-name'][1]")).getText();
		 System.out.println(" The name of cinema is " +cinemahall);
		 
		 
		 
		 
		 
		 

	}

}
