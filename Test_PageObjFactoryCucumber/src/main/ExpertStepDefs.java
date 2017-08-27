package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyDetails;
import PageObjects.ServicesPage;
import PageObjects.SignInPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpertStepDefs {
	private WebDriver driver;

	@Before
	public void beforeScenario() {
		// this will run before the actual scenario
		driver = new DriverFactory().getDriver();
	}

	@After
	public void afterScenario() throws InterruptedException {
		// this will run after scneario is finished, even if it failed
		new DriverFactory().destroyDriver();

	}

	@Given("^I am on home page$")
	public void setUp() throws Throwable {
		driver = new DriverFactory().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("url");
		Thread.sleep(1000);
	}

	@When("^I select services link$")
	public void goes_to_services_page() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.clickServicesLink();
	}

	@Then("^I can see services on offer$")
	public void he_can_see_services_on_offer() throws Throwable {
		ServicesPage servicesPage = new ServicesPage(driver);
		servicesPage.verifyServicesPage();
		servicesPage.verifyServiceHeadings();
	}

	@When("^I select login link$")
	public void goes_to_login_page() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.clickLogInLink();
	}

	@When("^I tried to login with incorrect details$")
	public void login_with_incorrect_details() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("^I can see why my login failed$")
	public void login_page_validations() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyPasswordValidationText();
		loginPage.verifyEmailValidationText();
		Thread.sleep(1000);
	}

	@Given("^I select sign up link$")
	public void i_select_signup_link() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.clickSignUpLink();
		//Thread.sleep(1000);
	}

	@When("^I enter my details$")
	public void i_enter_details(List<MyDetails> details) throws Throwable {
		SignInPage signInPage = new SignInPage(driver);

		for (MyDetails myDetail1 : details) {
			signInPage.setEmailText(myDetail1.email);
			signInPage.setFnameText(myDetail1.firstName);
			signInPage.setLnameText(myDetail1.lastName);
			// i=i+1;
			Thread.sleep(500);
		}

	}

	@Then("^I agree to the terms for hire$")
	public void i_agree_to_the_terms_for_hire() throws Throwable {
		SignInPage signInPage = new SignInPage(driver);
		signInPage.setHireRadioButton();
		signInPage.setTerms();
		Thread.sleep(1000);
	}
}
