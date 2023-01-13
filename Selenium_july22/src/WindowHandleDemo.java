import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindows.iterator();
		
		while (itr.hasNext()) {
			String child_window = itr.next();
			if(!MainWindow.equals(child_window)) {
				driver.switchTo().window(child_window);
				driver.findElement(By.xpath("//span[text()='2047']//preceding::div[@class='startsFrom']//parent::div[@class='priceDetails']//following-sibling::div[@class='knowMore']")).click();
				System.out.println(driver.getTitle());
			}
		}	
		driver.switchTo().window(MainWindow);
		

	}

}
