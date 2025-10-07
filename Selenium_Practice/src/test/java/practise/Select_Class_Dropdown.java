package practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Class_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		// Sort by drop down
		WebElement sort_by =driver.findElement(By.id("products-orderby"));
		Select obj_sel=new Select(sort_by);
		System.out.println(obj_sel.isMultiple());
		
		
		
		
	}

}
