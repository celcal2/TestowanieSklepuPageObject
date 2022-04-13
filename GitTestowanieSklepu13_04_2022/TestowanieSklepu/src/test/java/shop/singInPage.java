package shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class singInPage {
    private WebDriver driver;

    public singInPage(WebDriver driver) {
    }

    public void putCredentials(String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
    }

    public void addFirstAddress() {
        driver.findElement(By.id("submit-login")).click();
        driver.findElement(By.className("account")).click();
        driver.findElement(By.id("address-link")).click();
    }
}
