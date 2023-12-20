package stepDefs;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login  {

	WebDriver driver = TestBase.getDriver();
	LoginPage loginPage;
	
	public Login() {
		loginPage = new LoginPage(driver);	
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		TestBase.openUrl("https://www.demoblaze.com/");
		   
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
	    loginPage.loginIntoApp(strUser, strPwd);
	}
	/*@Then("USer should be on home page")
	public void u_ser_should_be_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();*/
	}



