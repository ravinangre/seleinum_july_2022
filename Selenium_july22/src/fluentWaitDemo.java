import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Explicit Web Driver Wait
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		// Explicit Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(TimeoutException.class);
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement colorChangeBtn = driver.findElement(By.xpath("//button[@id='colorChange']"));
		
		WebElement enableAfterBtn = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("Before button get enabled"+enableAfterBtn.isEnabled());
		
		System.out.println("Before Visible After Button shown color as"+colorChangeBtn.getCssValue("color"));
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		
		WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		
		System.out.println("Visible After Button is displayed after 5 seconds "+VisibleAfterBtn.isDisplayed());
		
		System.out.println("Before button get enabled"+enableAfterBtn.isEnabled());
		
		System.out.println("Before Visible After Button shown color as"+colorChangeBtn.getCssValue("color"));
		
	}

}
