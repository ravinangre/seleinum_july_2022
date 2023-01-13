import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		WebElement GetDemoBtn = driver.findElement(By.xpath("//a[@id='signupModalButton']"));
		act.moveToElement(GetDemoBtn).perform();
		
		 Thread.sleep(2000);
		
		WebElement ProductsBtn = driver.findElement(By.xpath("//button[text()='Products' and @id='product-menu-toggle']"));
		act.moveToElement(ProductsBtn).perform();
		
		WebElement LiveBtn = driver.findElement(By.xpath("//div[@class='dropdown-link-wrapper']//div[text()=' Live ']"));
		act.clickAndHold(LiveBtn).perform();
		
		WebElement contactUSBtn = driver.findElement(By.xpath("//button[text()=' Contact Us ']"));
		act.moveToElement(contactUSBtn).perform();

		Thread.sleep(2000);
		
		WebElement TermsBtn = driver.findElement(By.xpath("//footer//a[text()='Terms of Service']"));
		act.moveToElement(TermsBtn).perform();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		act.moveToElement(Buttons).perform();
		
		act.doubleClick(DoubleClickBtn).perform();
		act.contextClick(RightClickBtn).perform();
		act.click(DynamicClickBtn).perform();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(interactions).perform();
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Destination = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(Source, Destination).perform();
		
		act.clickAndHold(Source).perform();
		
	}

}
