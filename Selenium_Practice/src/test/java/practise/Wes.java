package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open Flipkart
        driver.get("https://www.flipkart.com/");

        // Close login popup
        try {
            WebElement closeBtn = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed");
        }

        // Enter "Puma" in search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Puma");
        Thread.sleep(2000); // wait for auto-suggestions to load

        // Get all auto-suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']//li"));

        System.out.println("Auto-suggestions for Puma:");
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        // Quit browser
        driver.quit();
    }

	}


