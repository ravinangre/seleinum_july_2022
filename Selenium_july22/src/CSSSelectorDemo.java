import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		
		// css selector with parent child relationship
		
		driver.findElement(By.cssSelector("nav>ul>li>a[title='Automation Practice']")).click();
		
		// Css Selector
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Ravi");
		
	//	driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Ravi");
		
	//	driver.findElement(By.cssSelector("input[id='name-firstname']")).sendKeys("Ravi");
		
	//	driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Nangare");
		
		driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Nangare");
		
//		driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("8830158607");
		
	//	driver.findElement(By.cssSelector("input[id^='ph']")).sendKeys("8830158607");
		
	//	driver.findElement(By.cssSelector("input[id$='ne']")).sendKeys("8830158607");

		driver.findElement(By.cssSelector("input[id*='ho']")).sendKeys("8830158607");
		
	//	driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
		
		// css selector with combinationations
		
	//	driver.findElement(By.cssSelector("input.coblocks-field--email#email")).sendKeys("ravinangre@gmail.com");
		
		// css selector with id along with other attribute
		
		driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("ravinangre@gmail.com");
		
		driver.get("https://www.facebook.com");
		
		// css selector with parent child relationship
	//	driver.findElement(By.cssSelector("div._6ltg>button")).click();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.cssSelector("select>option:nth-of-type(9)")).click();
		
		driver.findElement(By.cssSelector("div#withOptGroup>div>div.css-1hwfws3")).click();
		
		driver.findElement(By.cssSelector("div#withOptGroup>div>div>div:nth-of-type(3)")).click();
		
	}

}
