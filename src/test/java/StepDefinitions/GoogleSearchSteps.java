//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSearchSteps {
//
//WebDriver driver=null;
//
//@Given("Browser is open")
//public void browser_is_open() {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("Inside step: browser is open");
//	System.setProperty("webdriver.chrome.driver", "C:/Users/OMKAR/eclipse-workspace/CucumberFW/driver/chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	driver.get("https://www.google.com");
//	driver.findElement(By.name("q")).sendKeys("automation step by step");
//}
//
//@And("User is on google search page")
//public void user_is_on_google_search_page() {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("Inside step: user is on search browser");
//	driver.navigate().to("https://www.google.com");
//	
//}
//
//@When("user enters text in searchbox")
//public void user_enters_text_in_searchbox() throws InterruptedException {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("Inside step: User enter text in searchbox");
//	driver.findElement(By.name("q")).sendKeys("automation step by step");
//	Thread.sleep(2000);
//}
//
//@And("hits enter")
//public void hits_enter() {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("Inside step: user hits enter");
//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//}
//
//@Then("user is navigated to search results")
//public void user_is_navigated_to_search_results() {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("Inside step: user is navigated to search results");
//	driver.getPageSource().contains("Online Courses");
//	driver.close();
//	driver.quit();
//}
//
//
//}
