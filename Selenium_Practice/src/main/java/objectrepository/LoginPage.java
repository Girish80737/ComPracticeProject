package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;                      //Rule-1: create a seperate java class
	public LoginPage(WebDriver driver)     //Rule-2: Object Creation
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name="username")
	public WebElement usernameEdit;
	
	@FindBy(name="password")
	public WebElement passwordEdit;
	

	@FindBy(xpath="//button[@type='submit']")
	public WebElement signInBtn;
	
	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	public void loginToApp(String username,String password)
	{
		driver.manage().window().maximize();
		usernameEdit.sendKeys("rmgy@9999");
		passwordEdit.sendKeys("rmgyantra");
		signInBtn.click();
	}
}
