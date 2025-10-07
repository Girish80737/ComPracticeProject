package practise;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Working_With_Synchro_ExplicitWait {

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 WebElement searchpage = driver.findElement(By.tagName("h1"));
		wait.until(ExpectedConditions.visibilityOf(searchpage));
		driver.quit();
		
	}

}
