package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Stepdefination {
WebDriver driver;
@Given("Browser is launched")
public void browser_is_launched() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

@When("User enters the url")
public void user_enters_the_url() {
   driver.get("https://opensource-demo.orangehrmlive.com/");
}

@Then("User verifies the logo on the homepage")
public void user_verifies_the_logo_on_the_homepage() {
    boolean expected=driver.findElement(By.id("divLogo")).isDisplayed();
    Assert.assertEquals(true, expected);
}

@Then("Browser is closed")
public void browser_is_closed() {
   driver.close();
}
@Then("User enters the correct username and password")
public void user_enters_the_correct_username_and_password() {
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}

@Then("User clicks on Login")
public void user_clicks_on_Login() {
    driver.findElement(By.className("button")).click();
}

@Then("User clicks on logout button")
public void user_clicks_on_logout_button() {
    driver.findElement(By.className("panelTrigger")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
}
@Then("User verifies the title of the page")
public void User_verifies_the_title_of_the_page() {
	String actual="OrangeHRM";
   String expected = driver.getTitle();
   System.out.println(expected);
   Assert.assertEquals(expected, actual);
}


}
