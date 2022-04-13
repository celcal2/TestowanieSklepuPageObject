package shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class newAddressPage {
    private WebDriver driver;

    public newAddressPage(WebDriver driver) {
    }

    public void fillInData(String alias, String address, String city, String zip, String phone) {
        driver.findElement(By.name("alias")).sendKeys(alias);
        driver.findElement(By.name("address1")).sendKeys(address);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("postcode")).sendKeys(zip);
        WebElement selectElement2 = driver.findElement(By.name("id_country"));
        Select selectObject = new Select(selectElement2);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        driver.findElement(By.name("submitAddress")).submit();
    }

    public String getAlertText() {
        return driver.findElement(By.cssSelector("container")).getText();
    }
}
