import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(Testsonuc.class)
public class Main {
    WebDriver driver;
    @BeforeAll
    public void Kur()
    {
        String Expectedtitle = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-web-security");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        String Actualtitle = driver.getTitle();
        Assert.assertEquals(Actualtitle,Expectedtitle);
        

    }
}
