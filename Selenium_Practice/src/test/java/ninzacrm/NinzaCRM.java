package ninzacrm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NinzaCRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("__disable-save-password-bubble");
		options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>()
		{{
			put("credentials_enable_service", false);
			put("profile.password_manager_enabled", false);
			
		}});
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://49.249.28.218:8091/");
		driver.findElement(By.name("username")).sendKeys("rmgyantra");
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		//Alert ale = driver.switchTo().alert();
		//ale.dismiss();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.linkText("Create Project")).click();
		driver.findElement(By.name("projectname")).sendKeys("NewCRMapp");
		driver.findElement(By.name("createdBy")).sendKeys("ABDevilliers");
		WebElement sle = driver.findElement(By.name("status"));
		Select sel=new Select(sle);
		sel.deselectByVisibleText("OnGoing");
		driver.findElement(By.xpath("//input[value='Add Project']")).click();
		
			
	}

}
