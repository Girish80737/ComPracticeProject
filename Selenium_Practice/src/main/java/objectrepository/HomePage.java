package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
WebDriver driver;
public void Homepage(WebDriver driver)
{
	this.driver=null;
	PageFactory.initElements(driver, this);
}

@FindBy(linkText ="Projects")
public WebElement projectsLInk;

@FindBy(linkText = "Employees")
public WebElement employeeLink;

public WebElement getProjectsLInk() {
	return projectsLInk;
}

public WebElement getEmployeeLink() {
	return employeeLink;
}


}
