package scenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Open demoqa.com
        driver.get("https://demoqa.com/");

        // Step 2: Click on "Alerts, Frame & Windows"
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertsFrameWindows);

        // Step 3: Click on "Browser Windows" in left menu
        WebElement browserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        js.executeScript("arguments[0].click();", browserWindows);

        // Step 4: Store parent window handle
        String parentWindow = driver.getWindowHandle();

        // Step 5: Click on "New Window Message"
        WebElement newMessageBtn = driver.findElement(By.id("messageWindowButton"));
        newMessageBtn.click();

        // Step 6: Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Step 7: Switch to child window and copy text
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);

                // Message window only has <body> text
                String bodyText = driver.findElement(By.tagName("body")).getText();
                System.out.println("Text from New Message Window:\n" + bodyText);

                // Close the new message window
                driver.close();

	}


    }
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window: " + driver.getTitle());

        Thread.sleep(3000);
        driver.quit();
	}}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	
