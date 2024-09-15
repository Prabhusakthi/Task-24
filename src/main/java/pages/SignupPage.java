package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SignupPage {
	    WebDriver driver;

	    // Define web elements using @FindBy
	    @FindBy(id = "signin2")
	    WebElement signupButton;

	    @FindBy(id = "sign-username")
	    WebElement usernameField;

	    @FindBy(id = "sign-password")
	    WebElement passwordField;

	    @FindBy(css = "button[onclick='register()']")
	    WebElement registerButton;

	    // Constructor to initialize web elements using PageFactory
	    public SignupPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Methods to interact with elements
	    public void clickSignupButton() {
	        signupButton.click();
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickRegisterButton() {
	        registerButton.click();
	    }
	}



