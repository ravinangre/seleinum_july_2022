import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonDemo {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	    List<WebElement> grid1Elements = driver.findElements(By.xpath("//div[@id='desktop-grid-1']//span"));
	    
	    System.out.println(grid1Elements.size());
	    
	    Iterator<WebElement> itr = grid1Elements.iterator();
	    
	    while(itr.hasNext()) {
	    	
	    	System.out.println(itr.next().getText());
	    }

	}

}
