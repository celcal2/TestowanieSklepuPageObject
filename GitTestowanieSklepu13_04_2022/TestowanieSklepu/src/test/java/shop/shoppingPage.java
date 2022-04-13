package shop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class shoppingPage {
    private WebDriver driver;

    public void shopping() throws InterruptedException {
        driver.findElement(By.name("s")).sendKeys("Hummingbird Printed Sweater");
        driver.findElement(By.name("s")).submit();
        driver.findElement(By.partialLinkText("Hummingbird Printed Sweater")).click();
        WebElement size = driver.findElement(By.id("group_1"));
        Select selectObjectSize = new Select(size);
        selectObjectSize.selectByVisibleText("M");
        Thread.sleep(1000);
        driver.findElement(By.name("qty")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.name("qty")).sendKeys("5");
        driver.findElement(By.className("add")).click();
        driver.findElement(By.partialLinkText("PROCEED TO CHECKOUT")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("PROCEED TO CHECKOUT")).click();
    }

    public void seeAddress() {
        String address = driver.findElement(By.className("address")).getText();
        System.out.println(address);
    }
}
