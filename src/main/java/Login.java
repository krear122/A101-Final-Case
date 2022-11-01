import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login extends Main_Page{
    Actions actions = new Actions(driver);
    public Login(WebDriver driver) {
        super(driver);
    }

    public void step1()
    {
        WebElement girisyap = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[3]/div[2]/span/span[1]")));
        actions.moveToElement(girisyap).click().perform();
        WebElement girisyaptkla = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]")));
        actions.moveToElement(girisyaptkla).click().perform();


    }
    public void step2()
    {


        WebElement googlegiris = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnGoogle\"]/div[2]")));
        actions.moveToElement(googlegiris).click().perform();
        WebElement googlemail = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierId\"]")));
        googlemail.sendKeys("deneresekere@gmail.com");
        googlemail.sendKeys(Keys.ENTER);
        WebElement googlesifre = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
        googlesifre.sendKeys("12345678Ee");
        googlesifre.sendKeys(Keys.ENTER);
    }

}
