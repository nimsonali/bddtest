package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//simport com.wipro.testcases.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {

	WebDriver driver;

@Given("^user is already on homelogin Page$")
public void user_is_already_on_homelogin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

    
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("************hello jenkins sonali************");
   	System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	driver.get("https://demo.opencart.com/index.php?route=account/login");
   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
}


@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String title=driver.getTitle();
		System.out.print("title="+title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("abc.pqr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("welcome@123");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	    
	}


	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getCurrentUrl();
		System.out.print("title="+title);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("************hello jenkins sonali************");
	}
	
	//****************************below code for registration*********************************************
	
	@Given("^user is already on registratin page$")
	public void user_is_already_on_registratin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("************hello jenkins sonali************");
	   	System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
	   	 driver = new ChromeDriver();
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^user is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String titleofregi=driver.getTitle();
		System.out.print("title="+titleofregi);
	   
	}

	@Then("^user enter data in registration data$")
	public void user_enter_data_in_registration_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstname")).sendKeys("abc");
		 driver.findElement(By.name("lastname")).sendKeys("pqr");
		 driver.findElement(By.name("email")).sendKeys("abc.pqr@gmail.com");
		 driver.findElement(By.name("telephone")).sendKeys("23445");
		 driver.findElement(By.name("password")).sendKeys("welcome@123");
		 
		 driver.findElement(By.name("confirm")).sendKeys("welcome@123");
		 // driver.findElement(By.xpath("//input[@name='agree']\r\n")).click();
		 driver.findElement(By.xpath("//div[@class='col-sm-10']/label[1]")).click();
		  driver.findElement(By.xpath("//input[@name='agree']")).click();
			driver.findElement(By.xpath("//input[ @value='Continue']")).click();
				
			
	    
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
