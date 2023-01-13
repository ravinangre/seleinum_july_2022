import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kayboardActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
//		WebElement UserEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
//		WebElement userCurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//		WebElement UserPerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
//		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		
//		UserName.sendKeys("Ravi Nanagre");
//		UserEmail.sendKeys("ravinangre@gmail.com");
//		userCurrentAdd.sendKeys("Ambegaon Pune");
//		UserPerAdd.sendKeys("At post Lokhandi Sawargaon Tal Ambajogai");
//		SubmitBtn.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(UserName, "Ravi Nanagre").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("ravinangre@gmail.com").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("At Post Lokhandi Sawargaon Tal Ambajogai Dist Beed Pin 431517").perform();
		
		// Select a text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		// copy a text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		// Paste a selected text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
	//	act.click(SubmitBtn).perform();
		act.sendKeys(Keys.ENTER).perform();
	}

}
