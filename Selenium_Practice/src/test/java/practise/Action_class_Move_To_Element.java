package practise;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Action_class_Move_To_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//create an Action of object class
		Actions action=new Actions(driver);
		
		//Move To Element
		WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		action.moveToElement(computers).build().perform();
		
	}

}
