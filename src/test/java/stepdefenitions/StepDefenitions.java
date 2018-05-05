package stepdefenitions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class StepDefenitions {

    private static WebDriver driver;

    @Before
    public void before() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Given("^Facebook Website is opened in Chrome browser$")
    public void facebook_Website_is_opened_in_Chrome_browser() {
        driver.get( "https://www.facebook.com/" );
    }
    @When("^User enter '(.*?)' at name field - registered email$")
    public void user_enters_Login_at_the_name_Field(String login) {
        driver.findElement( By.cssSelector( "#email" ) ).sendKeys( login );
    }
    @When("^User enter '(.*?)' at password field - valid password$")
    public void user_enters_Password_at_the_password_Field(String password) {
        driver.findElement(By.cssSelector("#pass")).sendKeys(password);
    }
    @When("^User click Enter at enter button$")
    public void user_clicks_Enter_at_the_enter_button() {
        driver.findElements(By.cssSelector("#loginbutton")).get(0).click();
    }
    @Then("^Facebook's friends page for user '(.*?)' is opened in Chrome browser$")
    public void user_enters_account_for_count_friends(String account) {
        String startURL = "https://www.facebook.com";
        String currentURL = startURL +"/"+ account + "/friends";
        driver.get(currentURL);
        System.out.println("Page for test:" +" "+ currentURL);
    }
    @Then ("^Scroll friends to bottom$")
    public void ByVisibleElement () {
       for (int second = 0;second < 6000; second++) {
            ((JavascriptExecutor) driver).executeScript( "window.scrollBy(30,400)","" );
        }
    }
    @Then("^Count friends is shown$")
         public void count_friends_is_shown () {
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        int friends = driver.findElements(By.className("_698")).size();
        System.out.println(" , quantity of friends: "+ friends);
    }
    @After
         public void after() {
        driver.quit();
        }
    }


