package stepDefinittions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LogInMap;

public class LoginSteps {
	WebDriver driver;
	LogInMap lg;
	
	@Given("The user is in login page")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		lg = new LogInMap(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication");
	}

	@When("User send an email as {string}")
	public void user_send_an_email_as(String email) {
		
		lg.emailInput.sendKeys(email);
		lg.emailInput.click();
		lg.emailInput.getText();
		
		//WebElement emailInput = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		//System.out.println(email);
		//emailInput.sendKeys(email);
		
		////input[@type = 'text' and @id = 'email']
		

	}

	@When("User send password as {string}")
	public void user_send_password_as(String password) {
		System.out.println("I'm on When2");

		lg.passwordInput.sendKeys(password);
		
		//WebElement passwordInput = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
		//System.out.println(password);
		//passwordInput.sendKeys(password);
		
		
	}

	@When("User click on Sign in button")
	public void user_click_on_sign_in_button() {
		//System.out.println("I'm on When3");
		//WebElement submitLogin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		//submitLogin.click();
	
		lg.submitLogin.sendKeys(null);
		//button[@id='SubmitLogin']

	}

	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
		
		driver.quit();
	}
	
	@Then("User should get an error message as {string}")
	public void h(String mensaje) {
	    
		WebElement errormessage = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']//li"));
		
		Assert.assertEquals(errormessage.getText(), mensaje);
		Assert.assertTrue(errormessage.getText().equals(mensaje));
		
		driver.quit();


	}
	
	}

