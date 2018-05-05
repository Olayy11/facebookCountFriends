package stepdefenitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

//


//


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
        driver.get("https://www.facebook.com/");
        }



    @When("^User enter '(.*?)' at name field$")
    public void user_enters_Login_at_the_name_Field(String login) {
        driver.findElement(By.cssSelector("#email")).sendKeys(login);
    }

    @When("^User enter '(.*?)' at password field$")
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
        System.out.print(currentURL);
    }

    @Then ("^Scroll friends to bottom$")

        public void ByVisibleElement () {

////        JavascriptExecutor jse = (JavascriptExecutor)driver;
////        jse.executeScript("scroll(0, 1800)"); //y value '250' can be altered
////        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//
//        do {
//              ((JavascriptExecutor) driver).executeScript("window.scrollBy(25,26)", "");
////        } while (driver.findElement( By.cssSelector( ".mbm _5vf.sectionHeader._4khu" )).isDisplayed());
//        } while (driver.findElements(By.id( "pageFooter" )).size() > 0);

        for(int i=0;i<400;i++) {
                 ((JavascriptExecutor) driver).executeScript("window.scrollBy(30,31)", "");
            }
        }



    @Then("^Count friends is shown$")
         public void count_friends_is_shown () {
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        int friends = driver.findElements(By.className("_698")).size();
        System.out.println(friends);


      }



    @After
    public void after() {
        driver.quit();
    }
}


