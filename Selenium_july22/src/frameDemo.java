import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// Frame using index
	//	driver.switchTo().frame(2);
		// Frame using name or id 
	//	driver.switchTo().frame("frame1");
		// Frame using Webelement
	
		WebElement Frmae1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		driver.switchTo().frame(Frmae1);
		
		String FrameText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
		
		System.out.println(FrameText);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame2");
		
		System.out.println(FrameText);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
	//	String MainWindow = driver.getWindowHandle();
		
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[contains(@src,'youtube')]"));
		
		driver.switchTo().frame(Frame2);
		
	//	driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		driver.switchTo().parentFrame();
		
	//	driver.switchTo().window(MainWindow);
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//a[contains(@href,'live-selenium-project.html')]//img")).click();
	}

}
