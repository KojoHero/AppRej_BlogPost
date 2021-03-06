package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Disapprove_Steps {
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
		driver.close();
		driver.quit();
		
	}
	
	@Given("^Admin logs in\\(disapprove admin\\)$")
	public void admin_logs_in_disapprove_admin() throws Throwable {
		//Admin login
		driver.get("http://20.52.44.20/auth/login");
		driver.findElement(By.id("InputEmail")).sendKeys("alhaji@gmail.com");
		driver.findElement(By.id("InputPassword1")).sendKeys("Amalitech@2020");
		driver.findElement(By.id("signin_button")).click();
	}

	@Given("^goes to blog module\\(disapprove admin\\)$")
	public void goes_to_blog_module_disapprove_admin() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("openicon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div[7]/a/li")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bloglist\"]/a[3]/li")).click();	
	}

	@Given("^Admin clicks on disapprove\\(disapprove admin\\)$")
	public void admin_clicks_on_disapprove_disapprove_admin() throws Throwable {
		//admin clicks to approve	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[2]/button")).click();
		
		//assertion
		Thread.sleep(3000);
		String prompt = "Blog Post rejected successfully";
		String message  = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div/p")).getText();
		Assert.assertEquals(message, prompt);
	}
	
}
