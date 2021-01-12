package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppRej_steps {
	
	WebDriver driver = new ChromeDriver();

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\ApproveReject\\AppRej\\src\\test\\java\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		this.driver.manage().getCookies();

	}

	@After()
	public void end() {
		driver.quit();
	}

	
	@Given("^Admin logs in\\(admin\\)$")
	public void admin_logs_in_admin() throws Throwable {
		//Admin login
		driver.get("http://20.52.44.20/auth/login");
		driver.findElement(By.id("InputEmail")).sendKeys("amalitech@testing.com");
		driver.findElement(By.id("InputPassword1")).sendKeys("Kankama1");
		driver.findElement(By.id("signin_button")).click();
	}

	@Given("^goes to blog module\\(admin\\)$")
	public void goes_to_blog_module_admin() throws Throwable {
		//click on blog in admin dashboard
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
	}

	@Given("^Admin clicks on approve\\(admin\\)$")
	public void admin_clicks_on_approve_admin() throws Throwable {
		//admin clicks to approve
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
	}

	@Then("^User should receive an approval prompt\\(admin\\)$")
	public void user_should_receive_an_approval_prompt_admin() throws Throwable {
		//assert
	    String prompt = "";
	    String notification = driver.findElement(By.id("")).getText();
	    
	    Assert.assertEquals(prompt, notification);
	    
	}

	@Then("^if Admin clicks on reject\\(admin\\)\\)$")
	public void if_Admin_clicks_on_reject_admin() throws Throwable {
		//Going back to the blogs page
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		
		//admin rejects a post
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
	}

	@Then("^User should receive a rejection prompt\\(admin\\)$")
	public void user_should_receive_a_rejection_prompt_admin() throws Throwable {
		//assert
	    String prompt = "";
	    String notification = driver.findElement(By.id("")).getText();
	    
	    Assert.assertEquals(prompt, notification);
	}



}
