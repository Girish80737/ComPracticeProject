package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Select_class_Sort_By {

	public static void main(String[] args) 
	{
       WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on books link
		driver.findElement(By.partialLinkText("Books")).click();
		 
		//Sort By drop down
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select objsel = new Select(sort);
		objsel.selectByVisibleText("Price: Low to High");
		
		//Display Dropdown
		  WebElement display = driver.findElement(By.id("products-pagesize"));
		Select objsel1 =new Select(display);
		objsel1.selectByVisibleText("12");
		
		//View as DropDown
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select objsel2=new Select(view);
		objsel2.selectByIndex(1);
		
	}

}
