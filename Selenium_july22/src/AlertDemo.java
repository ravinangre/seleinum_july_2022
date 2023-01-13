import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String AlertText = driver.switchTo().alert().getText();
		
		System.out.println(AlertText);
		
	//	driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().accept();
		
		String AlertText1 = driver.switchTo().alert().getText();
		
		System.out.println(AlertText1);
		
		driver.switchTo().alert().accept();
		
		driver.get("https://demoqa.com/alerts");
		
		Actions action = new Actions(driver);
		
		WebElement NestedFrame = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
	
		action.moveToElement(NestedFrame).perform();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		driver.switchTo().alert().sendKeys("Ravi Nangare");
		driver.switchTo().alert().accept();
		
	}

}
