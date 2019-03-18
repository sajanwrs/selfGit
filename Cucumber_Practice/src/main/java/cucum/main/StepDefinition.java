package cucum.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	ChromeDriver driver;
	@Given("^i open a browser$")
	public void i_open_a_browser(){
	    driver = new ChromeDriver();
	}

	@When("^i navigate to facebook$")
	public void i_navigate_to_facebook(){
	    driver.get("https://www.facebook.com");
	}

	@When("^i put username as \"([^\"]*)\"$")
	public void i_put_username_as(String arg1){
	   driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);
	}

	@When("^i put password as \"([^\"]*)\"$")
	public void i_put_password_as(String arg1) throws InterruptedException{
	  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg1);
	  //Thread.sleep(2000);
	}

	@When("^i click on login$")
	public void i_click_on_login(){
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    //explicit wait
		WebDriverWait w = new WebDriverWait(driver, 2);
		WebElement ele = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='loginbutton']")));
		ele.click();
	}

	@Then("^i close the browser$")
	public void i_close_the_browser(){
		driver.quit();
	}
}
