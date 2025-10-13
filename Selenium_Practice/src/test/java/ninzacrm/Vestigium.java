package ninzacrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vestigium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://vestigium.crm.africa/home");
driver.findElement(By.id("email")).sendKeys("girishlnaik45@gmail.com");
driver.findElement(By.id("password")).sendKeys("Awesome5");
driver.findElement(By.id("loginSubmitButton")).click();
	}

}
