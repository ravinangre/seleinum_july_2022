import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProp {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium_july22\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("devurl"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
	//	driver.findElement(By.tagName("button")).click();

	}

}
