package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInMap {

	WebDriver driver;
	//Esta clase es para reutilzar las variables
	public LogInMap(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@id=\"email\"]")
	public WebElement emailInput;
	
	@FindBy(xpath="//input[@id=\"passwd\"]")
	public WebElement passwordInput;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public WebElement submitLogin;
	
	
}
