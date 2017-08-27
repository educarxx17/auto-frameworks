package PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	String emailValidation = "Please enter a valid email address";
	String passwordValidation = "Please enter your password";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(className = "c-button")
	private WebElement loginButton;

	@FindBy(id = "parsley-id-16")
	private WebElement emailValidationText;

	@FindBy(id = "parsley-id-18")
	private WebElement passwordValidationText;

	@FindBy(id = "c-feedback--error")
	private List<WebElement> validationText;

	public void clickLoginButton() {
		loginButton.click();
	}

	public void verifyEmailValidationText() {
		Assert.assertEquals(emailValidation, emailValidationText.getText());
	}

	public void verifyPasswordValidationText() {
		Assert.assertEquals(passwordValidation, passwordValidationText.getText());
	}
}
