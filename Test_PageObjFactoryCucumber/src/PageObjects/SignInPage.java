package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(id = "hire")
	private WebElement hire;

	@FindBy(id = "work")
	private WebElement work;

	@FindBy(id = "terms")
	private WebElement terms;

	@FindBy(className = "c-checkbox-button__label-text")
	private WebElement intentOption;

	public void setEmailText(String strEmail) {
		email.clear();
		email.sendKeys(strEmail);
	}

	public void setFnameText(String strFname) {
		firstname.clear();
		firstname.sendKeys(strFname);
	}

	public void setLnameText(String strLname) {
		lastname.clear();
		lastname.sendKeys(strLname);
	}

	public void setHireRadioButton() {
		intentOption.click();
	}

	public void setTerms() {
		terms.click();
	}
}
