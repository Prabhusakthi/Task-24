package tests;


	import base.BaseTest;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import pages.LoginPage;

	public class LoginTest extends BaseTest {
	    LoginPage loginPage;

	   
	    public void setUpPages() {
	        loginPage = new LoginPage(getDriver());
	    }

	   
	    public void testValidLogin() {
	        loginPage.clickLoginButton();
	        loginPage.enterUsername("validUser");
	        loginPage.enterPassword("validPassword");
	        loginPage.clickSubmitButton();

	        // Add an assertion to verify successful login (you can modify this based on expected behavior)
	        String expectedTitle = "Expected Title";
	        Assert.assertEquals(getDriver().getTitle(), expectedTitle, "Login failed.");
	    }

	    
	    public void testInvalidLogin() {
	        loginPage.clickLoginButton();
	        loginPage.enterUsername("invalidUser");
	        loginPage.enterPassword("invalidPassword");
	        loginPage.clickSubmitButton();

	        // Add an assertion to verify error message
	        // You need to add a method to LoginPage to return the error message.
	        // Example: String actualErrorMessage = loginPage.getErrorMessage();
	        String expectedErrorMessage = "Invalid credentials.";
	        // Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "Error message not as expected.");
	    }
	}



