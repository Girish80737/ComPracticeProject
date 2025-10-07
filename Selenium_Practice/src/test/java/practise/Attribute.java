package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://demowebshop.tricentis.com/");
       driver.findElement(By.id("small-searchterms")).sendKeys("Books");
       String subscribe_value = driver.findElement(By.id("small-searchterms")).getAttribute("value");
	   System.out.println(subscribe_value);
	}

}
