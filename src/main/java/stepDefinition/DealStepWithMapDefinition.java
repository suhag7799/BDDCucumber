package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// Data table with maps: for parameterization of test cases

public class DealStepWithMapDefinition {
	
	WebDriver driver;
	 @Given("^user is already on login page$") 
	  public void  user_already_on_login_page() {
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://classic.crmpro.com/");
	  	  }
	 
	  @When ("^title for login page is Free CRM$")
	  public void title_for_login_page_is_Free_CRM() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	  }
	  
	  @Then("^user enters username and password$")
	  public void user_enters_username_and_password(DataTable credentials)  {
		  for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
	  			driver.findElement(By.name("username")).sendKeys(data.get("username"));
	  			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		  		}
	}
	  
	  
	  @Then("^user click on login button$")
	  public void user_click_on_login_button()  {
	      driver.findElement(By.xpath("//input[@value='Login']")).click();
	  }

	  @Then("^user is on home page$")
	  public void user_is_on_home_page() {
		  String title = driver.getTitle();
		  System.out.println("home page title------"+title);
		  Assert.assertEquals("CRMPRO", title);
		 // driver.quit();
	  }
	  
	  @Then("^user move to new deal page$")
	  public void user_move_to_new_deal_page()  {
		  driver.switchTo().frame("mainpanel");
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		  System.out.println("move over finished");
		  driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	     
	  }
	  
	  @Then("^user enters deal details title and amount$")
	  public void user_enters_firstname_lastname_position(DataTable dealData)  {
		  for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
		  	  
		  	driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("comission"));
			System.out.println("NAme entered");
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
// ---- move back to new deal page		
						
			  Actions action = new Actions(driver);
			  action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			  System.out.println("move over finished");
			  driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		  }
	  }
	  
	  	  
	  @Then("^Close the browser$")
	  public void close_the_browser() throws InterruptedException {
	     Thread.sleep(10000);
	     driver.quit();
	  }
}
