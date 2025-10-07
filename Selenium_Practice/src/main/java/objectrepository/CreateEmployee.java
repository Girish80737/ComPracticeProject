package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployee 
{
	WebDriver driver;
	public void Homepage(WebDriver driver)
	{
		this.driver=null;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="projectName")
	public WebElement projectNameEdit;

}
