import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Program1 {

	@Test
	public void test1() {
		
		System.out.println("Hello World");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEW\\eclipse-workspace\\T2Maven\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEW\\eclipse-workspace\\T2Maven\\src\\test\\resources\\geckodriver.exe");
		//WebDriver wd = new ChromeDriver();
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.com");
		//wd.manage().timeouts().implicitlyWait(10, null);
		wd.close();
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Hello World");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEW\\eclipse-workspace\\T2Maven\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NEW\\eclipse-workspace\\T2Maven\\src\\test\\resources\\geckodriver.exe");
		//WebDriver wd = new ChromeDriver();
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.com");
		//wd.manage().timeouts().implicitlyWait(10, null);
		wd.close();
		
	}
}
