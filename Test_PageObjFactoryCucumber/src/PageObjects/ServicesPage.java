package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class ServicesPage {

	WebDriver driver;

	List<String> services = Arrays.asList("Strategy Consulting", "HR", "Digital Marketing", "Traditional Marketing",
			"Accounting and Finance", "Deal Advisory", "Sales & Operations");

	public ServicesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "c-banner__title")
	private WebElement bannerTitleText;

	@FindBy(className = "heading")
	private List<WebElement> serviceTypes;

	public void verifyServicesPage() {
		String strTitle = bannerTitleText.getText();
		Assert.assertEquals("Services", strTitle);
	}

	public void verifyServiceHeadings() {
		int i = 0;
		for (String service : services) {
			Assert.assertEquals(service, serviceTypes.get(i).getText());
			i = i + 1;
		}

	}
}
