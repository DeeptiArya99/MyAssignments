package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement brands = driver.findElement(By.xpath("//a[text() = 'brands']"));
		WebElement brandSearch = driver.findElement(By.xpath("//input[@id='brandSearchBox' ]"));
		WebElement Loreal = driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\" ]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands)
		.pause(Duration.ofSeconds(1))
		.moveToElement(brandSearch)
		.click().sendKeys("L'Oreal Paris").pause(Duration.ofSeconds(1)).click(Loreal)
		.perform();
		
		Thread.sleep(1000);
		
		String Title = driver.findElement(By.xpath("//div[@id='title']")).getText();
		if(Title.contains("L'Oreal Paris"))
		{
			System.out.println("Title contains Loreal");
		}
		else
		{
			System.out.println("Title does not contains Loreal");
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']]")).click();  //Click on Sort by
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();   //customer top rated
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='categories']")).click();  //category
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='hair']")).click();  //hair
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		Thread.sleep(1000);
		
		
		String shampoo = driver.findElement(By.xpath("//li[@class='last-list css-vnn8hz']")).getText();
		if(shampoo.contains("Shampoo"))
		{
			System.out.println("Filter is applied with shampoo");
		}
		
		else
		{
			System.out.println("Filter is not applied with shampoo");
		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[text()=\"L'Oreal Professionnel X-Tenso Care Sulfate free Shampoo & Ma...\"]")).click();
		
		String mainHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		List<String> handlesList =  new ArrayList<String> (allHandles);
		driver.switchTo().window(handlesList.get(1));
		Thread.sleep(1000);
		
		System.out.println("MRP IS : " +driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText());
		
		driver.findElement(By.xpath("//div[@class='css-vp18r8']//span[text()='Add to Bag']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		Thread.sleep(1000);
		
		String TotalAmount = driver.findElement(By.xpath("//div[@class='css-11m81vr e1d9ugpt3']//p[@class='css-1hn65a5 eka6zu20']")).getText();
		System.out.println(TotalAmount);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		Thread.sleep(1000);
		
		String FinalPrice = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		
		if(TotalAmount==FinalPrice)
		{
			System.out.println("Grandtotal is equal");
		}
		
		else
		{
			System.out.println("Grandtotal is not equal");
		}
		
		
		
		
		
		
	}

}
