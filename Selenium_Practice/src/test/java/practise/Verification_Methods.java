package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Methods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
         //is displayed
		/*if(driver.findElement(By.id("small-searchterms")).isDisplayed())
		{
			driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		}
		
		//is Enabled
		
		if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled())
		{
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		*/
		//Check if the radio button excellent is checked
		
		driver.findElement(By.id("pollanswers-1")).click();
		if(driver.findElement(By.id("pollanswers-1")).isSelected())
		{
	    System.out.println("The Excellent radio button is selected Successfully/*");
	
	}
	
		
	}

}
