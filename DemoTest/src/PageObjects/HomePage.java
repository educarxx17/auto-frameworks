package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Services")
	private WebElement servicesLink;

	@FindBy(linkText = "Log In")
	private WebElement logInLink;

	@FindBy(linkText = "Sign Up")
	private WebElement signUpLink;

	
	public void clickServicesLink() {
		servicesLink.click();
	}

	public void clickLogInLink() {
		logInLink.click();
	}

	public void clickSignUpLink() {
		signUpLink.click();
	}

}
