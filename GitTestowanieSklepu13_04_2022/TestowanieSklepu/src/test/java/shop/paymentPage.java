package shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class paymentPage {
    private WebDriver driver;

    public void paymentMethod() throws InterruptedException {
        driver.findElement(By.id("checkout-delivery-step")).click();
        Thread.sleep(500);
        driver.findElement(By.id("checkout-payment-step")).click();
        driver.findElement(By.id("payment-option-1")).click();

        String paymentLocator = "//label[contains(.,'Pay by Check')]";
        driver.findElement(By.xpath(paymentLocator)).click();
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.id("payment-confirmation")).click();

        driver.findElement(By.name("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.id("payment-confirmation")).click();
    }
}
