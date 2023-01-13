import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Lg tv 32 Inch");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='LG 80 cm (32 inch) HD Ready LED Smart WebOS TV with Alpha5 Gen5 AI Processor | (Ceramic Black) (2022 M...']")).click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> ChildWindow=driver.getWindowHandles();
		for(String Childwindow : ChildWindow) {
		if(!MainWindow.equals(Childwindow)) {
		driver.switchTo().window(Childwindow);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}
			
		}


	}

}
