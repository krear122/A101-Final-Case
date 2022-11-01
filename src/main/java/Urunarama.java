import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class Urunarama extends Main_Page{

    public Urunarama(WebDriver driver) {
        super(driver);
    }
    By aramalocator = By.xpath("/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input");
    By aratclk = By.xpath("/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]");

    public void case1urunarat()
    {
        WebElement urunarata = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(aramalocator));
        urunarata.sendKeys("silgi");
        WebElement aramaclke = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(aratclk));
        aramaclke.click();
        WebElement uruntklat = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(.,'Tombow Mono Zero Kalem Silgi 2,3 mm.')]")));
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].click();", new Object[]{uruntklat});
        Set wnd = driver.getWindowHandles();
        Iterator i = wnd.iterator();
        String popwnd = (String) i.next();
        String prntw = (String) i.next();
        driver.switchTo().window(prntw);
    }
    public void Case2urunarat() {

        WebElement urunara = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(aramalocator));
        urunara.sendKeys("kalem");
        WebElement aramaclk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(aratclk));
        aramaclk.click();
        WebElement urunsec = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(.,'PENSAN BÜRO TÜKENMEZ KALEM 1MM 2270 MAVİ 50 Lİ')]")));
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].click();", new Object[]{urunsec});
        Set wnd = driver.getWindowHandles();
        Iterator i = wnd.iterator();
        String popwnd = (String) i.next();
        String prntw = (String) i.next();
        String prnkw = (String) i.next();
        driver.switchTo().window(prnkw);








    }
}
