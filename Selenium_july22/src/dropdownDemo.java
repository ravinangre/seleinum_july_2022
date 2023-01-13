import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Dynamic Drop down
		
				driver.get("https://demoqa.com/select-menu");
				WebElement SelectOpt = driver.findElement(By.xpath("//div[@id='withOptGroup']//div[@class=' css-1hwfws3']"));
				SelectOpt.click();
				
				driver.findElement(By.xpath("//div[text()='Group 2, option 2']")).click();
		
		
		driver.get("https://www.facebook.com/reg/");
		
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
	//	Select day = new Select(Day);
	//	day.selectByIndex(13);
	//	day.selectByVisibleText("13");
		driver.findElement(By.cssSelector("select#day>option:nth-of-type(14)")).click();
	
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
	//	Select month = new Select(Month);
	//	month.selectByValue("11");
		
		driver.findElement(By.cssSelector("select#month>option:nth-of-type(11)")).click();
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(Year);
		year.selectByVisibleText("2000");
		
		
		
	}

}
