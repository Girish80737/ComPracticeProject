package practise;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Working_On_Popups {

	public static void main(String[] args) throws InterruptedException
	{
		
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
    /* driver.get("https://demowebshop.tricentis.com/");
     //Click on search Button Without Entering Text
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     Thread.sleep(3000);
     //Handle alert popup
     Alert ale = driver.switchTo().alert();
     ale.accept();
     System.out.println("Alert was handled successfully");
     driver.findElement(By.id("small-searchterms")).sendKeys("Alert Was Handled");*/
     
     //Dimiss Popups
     driver.get("https://demo.guru99.com/test/delete_customer.php");
     driver.findElement(By.name("cusid")).sendKeys("9768");
     Thread.sleep(3000);
     driver.findElement(By.name("submit")).click();
     Thread.sleep(3000);
     driver.switchTo().alert().dismiss();
     System.out.println("Alert Was Handled With dismiss Method");
     Thread.sleep(3000);
     driver.close();
	}

}
