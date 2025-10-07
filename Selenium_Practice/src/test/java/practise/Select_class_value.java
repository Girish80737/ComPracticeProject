package practise;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Select_class_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement sort = driver.findElement(By.id("products-orderby"));
        Select objsel=new Select(sort);
		List<WebElement> sortby_values = objsel.getOptions();
		
		//iterate on list to print the values
		for(WebElement value:sortby_values)
		{
			//System.out.println(value);
			System.out.println(value.getText());
		}
	}

}
