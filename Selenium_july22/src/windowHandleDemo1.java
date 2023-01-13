import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleDemo1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	//driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
	
	String MainWindow = driver.getWindowHandle();
	
	Set<String> ChildWindows = driver.getWindowHandles();
	
	for(String childwindow : ChildWindows) {
		if(!MainWindow.equals(childwindow)) {
		driver.switchTo().window(childwindow);
		String headingTest = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(headingTest);
		}
	//	driver.close();
	}
//	Iterator<String> itr = ChildWindows.iterator();
//	
//	while (itr.hasNext()) {
//		String child_window = itr.next();
//		if(!MainWindow.equals(child_window)) {
//			driver.switchTo().window(child_window);
//		//	String headingTest = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
//	//	String bodyText =	driver.findElement(By.xpath("/html/body/text()")).getText();
//		//	System.out.println(bodyText);
//		//	driver.close();
//		}
//	}	
//	driver.switchTo().window(MainWindow);
//	driver.quit();

}
}
