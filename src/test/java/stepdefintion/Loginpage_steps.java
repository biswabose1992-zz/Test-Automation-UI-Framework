package stepdefintion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.Loginpageobjects;

import util.Constants;

public class Loginpage_steps 
	{
		
		WebDriver driver=null;
		Loginpageobjects Loginpage;
		
		@Given("I visit Hudl website")
		public void i_visit_hudl_website() {
				
			
			WebDriverManager.chromedriver().setup(); 
			ChromeOptions options = new ChromeOptions();
			driver=new ChromeDriver(options);	
			driver.get(Constants.url);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
		}

	
		@When("I click on Login button")
		public void i_click_on_login_button() {
			
			Loginpage=new Loginpageobjects(driver);
			Loginpage.clickLoginbutton();
		}

	
		@Then("I should be able to enter user credentials")
		public void i_should_be_able_to_enter_user_credentials() {
			
			Loginpage=new Loginpageobjects(driver);
			Loginpage.enterusercredentials();;			
		}

		@Then("I login to the webiste")
		public void i_login_to_the_webiste() {
			
			Loginpage=new Loginpageobjects(driver);
			Loginpage.logginginwebiste();
				
		}

		@Then("I should be able to land on user homepage")
		public void i_should_be_able_to_land_on_user_homepage() {

			Loginpage=new Loginpageobjects(driver);
			Loginpage.veriifyhomepage();
			
		}
	
		
		
		/*
		 * Usage of Hooks
		 */
		
		@After()
		public void Afterscenario() {	
			this.driver.close();
			this.driver.quit();
		}
		
		
		
	}
		
		
		
		
	
