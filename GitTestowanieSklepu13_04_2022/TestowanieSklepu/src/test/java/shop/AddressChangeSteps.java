package shop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddressChangeSteps {
    public WebDriver driver;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Given("open the main page and press the singIn")
    public void openLoginPAge() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl");
        driver.findElement(By.partialLinkText("Sign in")).click();
    }

    @When("^login into the shop page with my email (.*) and password (.*)$")
    public void loginWithCredentials(String email, String password) throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("hcggctlmtnzicmznqu@bvhrk.com");
        driver.findElement(By.name("password")).sendKeys("hasło");
        Thread.sleep(1000);
        driver.findElement(By.id("submit-login")).click();
    }

    @And("^set the alias (.*) address (.*) city (.*) zip (.*) phone (.*)$")
    public void setTheNewAddress(String alias, String address, String city, String zip, String phone) {
        driver.findElement(By.className("account")).click();
        driver.findElement(By.id("address-link")).click();
        driver.findElement(By.name("alias")).sendKeys(alias);
        driver.findElement(By.name("address1")).sendKeys(address);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("postcode")).sendKeys(zip);
        WebElement selectElement2 = driver.findElement(By.name("id_country"));
        Select selectObject = new Select(selectElement2);
        selectObject.selectByVisibleText("United Kingdom");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("phone");
        driver.findElement(By.name("submitAddress")).submit();
    }

    @And("verify the data")
    public String verifyTheData() {
        driver.findElement(By.partialLinkText("Address successfully added!")).isDisplayed();
        String alert = driver.findElement(By.cssSelector("alert.alert-success")).getText();
        System.out.println(alert);
        String addressCheck = driver.findElement(By.className("address")).getText();
        System.out.println(addressCheck);

        public String getAlertText () {
            return driver.findElement(By.cssSelector("container")).getText();
        }

        @And("delete the data and veryfy")
        public void deleteTheDataAndVeryfy () {
            driver.findElement(By.partialLinkText("Delete")).click();
            driver.findElement(By.partialLinkText("Address successfully deleted!")).isDisplayed();
        }

        @Then("close browser")
        public void closeBrowser () {
            driver.quit();
        }
    }
}
