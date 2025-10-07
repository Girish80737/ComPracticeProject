package practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Relative_Locator {

	public static void main(String[] args) 
	{
     
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		/*driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");
		
		//To click on Search Button
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
		
		//For Excellent Radio Button
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pollanswers-1"))).click();*/
		
		//Click on Registr link using near() loacator
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
	}

}
