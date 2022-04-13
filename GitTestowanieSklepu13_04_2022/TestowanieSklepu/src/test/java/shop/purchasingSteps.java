package shop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class purchasingSteps<assertEquals> {

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

import static assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

    private WebDriver driver;

    @Given("open the main page")
    public void open() {
        MainPage mainPage = new MainPage(driver);
        mainPage.singIn();
    }

    @When("^login with my email (.*) and password (.*)$")
    public void loginWithMyEmailEmailAndPasswordPassword(String email, String password) {
        singInPage singIn = new singInPage(driver);
        singIn.putCredentials(String email, String password);
    }

    @And("chosse to create the new address")
    public void chosseToCreateTheNewAddress() {
        singInPage singIn = new singInPage(driver);
        singIn.addFirstAddress();
    }

    @And("^set the alias (.*) address (.*) city (.*) zip (.*) phone (.*)$")
    public void setTheAliasAliasAddressAddressCityCityZipZip(String alias, String address, String city, String zip, String phone) {
        newAddressPage newAddress = new newAddressPage();
        newAddress.fillInData();
        newAddressPage newAddressPage = new newAddressPage(driver);
        assertEquals("Address successfully added!", newAddressPage.getAlertText());
    }

    @And("do the shopping")
    public void chooseTheHummingbirdPrintedSweater() throws InterruptedException {
        shoppingPage shoppingPage = new shoppingPage(driver);
        shoppingPage.shopping();
    }

    @And("check the pick up method and pay method")
    public void checkThePickUpMethodAndPayMethod() throws InterruptedException {
        paymentPage paymentPage = new paymentPage(driver);
        paymentPage.paymentMethod();
        shoppingPage shoppingPage = new shoppingPage(driver);
        shoppingPage.seeAddress();
    }

    @Then("make the printscreen and the purchasing is done")
    public void makeThePrintscreeAndThePurchasingIsDone() {
        finalShoppingPage finalShoppingPage = new finalShoppingPage();
        finalShoppingPage.shoppingConfirmation();
    }
}
