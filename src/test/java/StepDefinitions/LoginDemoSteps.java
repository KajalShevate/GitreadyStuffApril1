package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {

	WebDriver driver=null;
	LoginPage login;
	@Given("browser is open")
	public void browser_is_open() {
	    
		System.out.println("Inside step: browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/OMKAR/eclipse-workspace/CucumberFW/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
}

@And("user is on login page")
public void user_is_on_login_page() {
    driver.navigate().to("https://example.testproject.io/web/");
    
}

@When("^user enter (.*) and (.*)$")
public void user_enter_username_and_password(String username,String password) throws InterruptedException {
	login=new LoginPage(driver);
	
	login.enterUsername(username);
	login.enterPassword(password);
	
	
	Thread.sleep(2000);
}
@And("user clicks on login")
public void user_clicks_on_login() {
	login.clickLogin();
    
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	login.checkLogoutDisplayed();
// driver.close();
// driver.quit();
}


}
