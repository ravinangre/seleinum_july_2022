import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amznDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//search to I phone and Add to card
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 14 Pro Max 128GB Deep Purple");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 Pro Max 128GB Deep Purple') and @class='a-size-medium a-color-base a-text-normal']")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> ChildWindows = driver.getWindowHandles();
		Set<String> ChildWindows1= driver.getWindowHandles();
		Iterator<String> itr = ChildWindows.iterator();
		
		while (itr.hasNext()) {
		String child_window = itr.next();
		if(!MainWindow.equals(child_window)) {
		driver.switchTo().window(child_window);
		driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']")).submit();
		driver.close();
		driver.switchTo().window(MainWindow);
		
		//Search to One Plus Mobiles and add to card 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus Mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']")).click();
		
		
		Set<String> ChildWindow=driver.getWindowHandles();
		for(String Childwindow : ChildWindow) {
		if(!MainWindow.equals(Childwindow)) {
		driver.switchTo().window(Childwindow);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).submit();
		driver.close();
		driver.switchTo().window(MainWindow);
		
		//Search To Hp Laptop and Add to card
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
		driver.findElement(By.xpath("//option[text()='Computers & Accessories']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='HP']")).click();
		driver.findElement(By.xpath("//span[(text()='HP 14s, 11th Gen Intel Core i3-1115G4, 8GB RAM/256GB SSD 14-inch(35.6 cm) Micro-Edge, Anti-Glare, FHD Laptop/Alexa Built-in/Win 11/Intel UHD Graphics/Dual Speakers/ MSO 2021/1.41 Kg, 14s-dy2507TU')]")).click();
		
		Set<String> ChildWindow1=driver.getWindowHandles();
		for(String Childwindow1 : ChildWindow1) {
		if(!MainWindow.equals(Childwindow1)) {
		driver.switchTo().window(Childwindow1);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).submit();	
		driver.close();
		
		
		}
		
		}
		}
		}
		}
		}
		
		}

}
