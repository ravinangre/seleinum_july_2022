import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String UtkarshaaURL = "https://www.utkarshaaacademy.com";
		driver.get("https://www.utkarshaaacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
