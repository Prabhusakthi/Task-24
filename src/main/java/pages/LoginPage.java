package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    WebDriver driver;

	    // Define web elements using @FindBy
	    @FindBy(id = "login2")
	    WebElement loginButton;

	    @FindBy(id = "loginusername")
	    WebElement usernameField;

	    @FindBy(id = "loginpassword")
	    WebElement passwordField;

	    @FindBy(css = "button[onclick='logIn()']")
	    WebElement submitButton;

	    // Constructor to initialize web elements using PageFactory
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Methods to interact with elements
	    public void clickLoginButton() {
	        loginButton.click();
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickSubmitButton() {
	        submitButton.click();
	    }
	}



