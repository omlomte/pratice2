package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEndStepDefination {
	WebDriver driver;

	@Given("User is on Sauce Demo Application")
	public void user_is_on_sauce_demo_application() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@When("Enter Valid username and password")
	public void enter_valid_username_and_password() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();

	}

	@When("Select the product and click on Add To Cart button")
	public void select_the_product_and_click_on_add_to_cart_button() {

		driver.findElement(By.xpath("//button[@class = 'btn_primary btn_inventory']")).click();

	}

	@Then("Click on container")
	public void click_on_container() {

		driver.findElement(By.id("shopping_cart_container")).click();

	}

	@Then("Click On checkout button")
	public void click_on_checkout_button() {

		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();

	}

	@When("User enter their Firstname Lastname and zipcode")
	public void user_enter_their_firstname_lastname_and_zipcode() {

		driver.findElement(By.id("first-name")).sendKeys("aaaa");
		driver.findElement(By.id("last-name")).sendKeys("bbbb");
		driver.findElement(By.id("postal-code")).sendKeys("123123");

	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {

		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();

	}

	@Then("Click on finish button")
	public void click_on_finish_button() {
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();

	}

}
