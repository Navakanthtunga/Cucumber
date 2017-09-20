package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Login_Test {
	WebDriver driver;
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		ChromeDriverManager.getInstance().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("^Navigate to Login Page$")
	public void navigate_to_Login_Page() throws Throwable {
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?");
	}
	@When("^Enter username$")
	public void enter_username(String arg1) throws Throwable {
		driver.findElement(By.id("identifierIdd")).sendKeys(arg1);
	}
	@Then("^click on next button$")
	public void click_on_next_button() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
