package shop;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class finalShoppingPage {
    public WebDriver driver;

    public void shoppingConfirmation() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\celin\\Desktop\\CodersLab_kurs\\Automatyzujący\\TestowanieSklepu\\screen.jpg"));
    }
}
