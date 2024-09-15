package tests;

	import base.BaseTest;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import pages.SignupPage;

	public class SignupTest extends BaseTest {
	    SignupPage signupPage;

      public void setUpPages() {
	        signupPage = new SignupPage(getDriver());
	    }

	 	    public void testValidSignup() {
	        signupPage.clickSignupButton();
	        signupPage.enterUsername("newUser");
	        signupPage.enterPassword("newPassword");
	        signupPage.clickRegisterButton();

	        // Add an assertion to verify successful signup (you can modify this based on expected behavior)
	        // Example: String actualSuccessMessage = signupPage.getSuccessMessage();
	        // Assert.assertTrue(actualSuccessMessage.contains("Signup successful"), "Signup failed.");
	    }

	    
	    public void testDuplicateSignup() {
	        signupPage.clickSignupButton();
	        signupPage.enterUsername("existingUser");
	        signupPage.enterPassword("existingPassword");
	        signupPage.clickRegisterButton();

	        // Add an assertion to verify error message for duplicate signup
	        // Example: String actualErrorMessage = signupPage.getErrorMessage();
	        // Assert.assertTrue(actualErrorMessage.contains("User already exists"), "Error message mismatch.");
	    }
	}


