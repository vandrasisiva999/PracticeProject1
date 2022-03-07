import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriver_TC01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\\\Users\\\\NEW\\\\eclipse-workspace\\\\T2Maven\\\\src\\\\test\\\\resources\\\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(10, null);
		wd.close();
	}

}
