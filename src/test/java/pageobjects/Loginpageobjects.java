package pageobjects;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Constants;

public class Loginpageobjects {

		/*
		 * Defining locators in Page Factory model with selenium
		 */
	
	
		@FindBy(xpath = "//a[@class='btn__blue login']")
		WebElement HomeLoginbtn;
		
		@FindBy(id = "email")
		WebElement Userid;
		
		@FindBy(id = "password")
		WebElement Password;
		
		@FindBy(id = "logIn")
		WebElement LogInbutton;
		
		@FindBy(xpath = "//span[contains(text(),'Video')]/..")
		WebElement VideoLink;
		
		
		@FindBy(xpath = "//span[contains(text(),'Reports')]/..")
		WebElement ReportsLink;
				
		
		WebDriver driver;


		public Loginpageobjects(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver,this);

		}

		
		public void clickLoginbutton() {
			
			HomeLoginbtn.click();
		}

			
		public void enterusercredentials() 
		{
				Userid.click();
				Userid.sendKeys(Constants.userid);
				Password.click();
				Password.sendKeys(Constants.pwd);
		}
	
		
		public void logginginwebiste() {
			
				LogInbutton.click();
		}

		
		public void veriifyhomepage() {
			
				VideoLink.isDisplayed();
				ReportsLink.isDisplayed();
		}
}
