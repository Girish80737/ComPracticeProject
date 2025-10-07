package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qn_5 {

	public static void main(String[] args) 
	{
      
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		Actions action=new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
		action.moveToElement(fashion).perform();
		driver.findElement(By.xpath("//span[@class='_3Pzn-c']")).click();
	}

}
