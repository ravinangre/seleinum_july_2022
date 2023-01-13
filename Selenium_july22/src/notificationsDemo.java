import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationsDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	//	option.addArguments("--headless");
	//	option.addArguments("window-size=390,844");
		WebDriver driver = new ChromeDriver(option);
		Dimension dem = new Dimension(750,450);
		driver.manage().window().setSize(dem);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("D:\\Selenium_july22\\src\\fb.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	    String userName =	driver.findElement(By.xpath("//span[contains(text(),'Sunil J')]")).getText();
	    System.out.println(userName);
	    System.out.println("Method Pass");
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
