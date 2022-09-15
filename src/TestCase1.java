import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver" );
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new SafariDriver();
		
		driver.get("https://www.ebay.com/");
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
