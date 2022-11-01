import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class UrunEkle extends Main_Page {


    Actions action = new Actions(driver);
    public UrunEkle(WebDriver driver) {
        super(driver);
    }
    public void Case1urunekle()
    {
        WebElement uruneklebire = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addToCart\"]")));
        action.moveToElement(uruneklebire).click().perform();
        WebElement urunekleikie = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", urunekleikie);
        action.moveToElement(urunekleikie).click().perform();
        WebElement sepetegider = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shoppingCart\"]")));
        action.moveToElement(sepetegider).click().perform();

    }
    public void Case1cikis() throws InterruptedException {
        WebElement cikisyap = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[4]/div[2]/div/div/span")));
        action.moveToElement(cikisyap).click().perform();
        WebElement cikisyaptkla = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[4]/div[2]/div/div[2]/div[2]/ul/li[2]/a")));
        action.moveToElement(cikisyaptkla).click().perform();
        Thread.sleep(2000);
        driver.get("https://www.hepsiburada.com/");
    }
    public void Case2Urunuekle() {



        WebElement uruneklebir = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addToCart\"]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uruneklebir);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", uruneklebir);
        WebElement urunekleiki = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//form/button")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", urunekleiki);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", urunekleiki);
        WebElement sepetegit = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shoppingCart\"]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sepetegit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sepetegit);




    }
}
