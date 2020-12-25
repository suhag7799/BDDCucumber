//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginStepDefinition {
//	WebDriver driver;
//	
//	
//	  @Given("^user is already on login page$") 
//	  public void  user_already_on_login_page() {
//		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
//		  driver = new ChromeDriver();
//		  driver.get("https://classic.crmpro.com/");
//	  	  }
//	 
//	  @When ("^title for login page is Free CRM$")
//	  public void title_for_login_page_is_Free_CRM() {
//		 String title = driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//		 
//	  }
//	  // Regular expression -- for without example keyword
//	  // 1. \"(.*)\"
//	  // 2. \"([^\"]*)\"
//	  
//	  @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	  public void user_enters_username_and_password(String username, String password)  {
//	     driver.findElement(By.name("username")).sendKeys(username);
//	     driver.findElement(By.name("password")).sendKeys(password);
//	  }
//
//	  @Then("^user click on login button$")
//	  public void user_click_on_login_button()  {
//	      driver.findElement(By.xpath("//input[@value='Login']")).click();
//	  }
//
//	  @Then("^user is on home page$")
//	  public void user_is_on_home_page() {
//		  String title = driver.getTitle();
//		  System.out.println("home page title------"+title);
//		  Assert.assertEquals("CRMPRO", title);
//		 // driver.quit();
//	  }
//	
//	  @Then("^user move to new contact page$")
//	  public void user_move_to_new_contact_page()  {
//		  driver.switchTo().frame("mainpanel");
//		  Actions action = new Actions(driver);
//		  action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		  System.out.println("move over finished");
//		  driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	     
//	  }
//	  
//	  @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	  public void user_enters_firstname_lastname_position(String firstname, String lastname, String position)  {
//		  driver.findElement(By.id("first_name")).sendKeys(firstname);
//			driver.findElement(By.id("surname")).sendKeys(lastname);
//			driver.findElement(By.id("company_position")).sendKeys(position);
//			System.out.println("NAme entered");
//			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		      
//	  }
//
//	  @Then("^Close the browser$")
//	  public void close_the_browser() throws InterruptedException {
//	     Thread.sleep(10000);
//	     driver.quit();
//	  }
//
//	  
//	  
//	  
//	  
//	  
//	  
//	
//}
