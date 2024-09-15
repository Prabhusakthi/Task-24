package base;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class BaseTest {
	    WebDriver driver;

	    
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaleeswari\\eclipse-workspace\\Task24\\src\\main\\java\\base\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.demoblaze.com/");
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }

	    
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



