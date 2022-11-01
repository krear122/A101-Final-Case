import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tester extends Main{
    Login loginn;
    Urunarama urunarama;
    UrunEkle urunekle;

@Test
@Order(1)
public void Case1login() throws InterruptedException {
    loginn = new Login(driver);
    loginn.step1();
    Case1loginkontroltitle();
    loginn.step2();
    Case1hesabimgiriskontrol();
    Case1urunara();
    Case1uruntitlekontrol();
    Case1urunekle();
    Case1sepeturunkontrol();
    urunekle = new UrunEkle(driver);
    urunekle.Case1cikis();




}


public void Case1urunara()
{
urunarama = new Urunarama(driver);
urunarama.case1urunarat();
}
public void Case1urunekle()
{
    urunekle = new UrunEkle(driver);
    urunekle.Case1urunekle();

}

public void Case1loginkontroltitle()

{
    String Expectedtitle = "Üye Giriş Sayfası & Üye Ol - Hepsiburada";
    String Actualtitle = driver.getTitle();
    Assert.assertEquals(Actualtitle,Expectedtitle);
}
public void Case1hesabimgiriskontrol()
{
    Actions action = new Actions(driver);
    WebElement giriskontrol = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myAccount\"]/span/a/span[1]")));
    action.moveToElement(giriskontrol);
    String giriskontrol1 = driver.findElement(By.xpath("//*[@id=\"myAccount\"]/span/a/span[1]")).getText();
    String giriskontrol11 = "Hesabım";
    Assert.assertEquals(giriskontrol1,giriskontrol11);
}
public void Case1uruntitlekontrol()
{
    String Expectedtitle = "Tombow Mono Zero Kalem Silgi 2,3 mm. Fiyatı - Taksit Seçenekleri";
    String Actualtitle = driver.getTitle();
    Assert.assertEquals(Actualtitle,Expectedtitle);

}
public void Case1sepeturunkontrol()
{

    Actions action = new Actions(driver);
    WebElement saticibekle = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[3]/div/div/div[1]/span[2]/a")));
    action.moveToElement(saticibekle);
    String satici1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[3]/div/div/div[1]/span[2]/a")).getText();
    String satici11 = "Hakikatankara";
    Assert.assertEquals(satici1,satici11);
    String satici2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/div/div[1]/span[2]/a")).getText();
    String satici22 = "Global Center";
    Assert.assertEquals(satici2,satici22);




}

@Test
@Order(2)
    public void Case2Urunarat(){
       urunarama = new Urunarama(driver);
       urunarama.Case2urunarat();
       Case2Urunekler();


    }

    public void Case2Urunekler(){
        WebElement urunbaslk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-name\"]")));
        String Expectedtitle = urunbaslk.getText();
        String Actualtitle = "PENSAN BÜRO TÜKENMEZ KALEM 1MM 2270 MAVİ 50 Lİ";
        Assert.assertEquals(Actualtitle,Expectedtitle);
        urunekle = new UrunEkle(driver);
        urunekle.Case2Urunuekle();
        Case2sepetkontrolet();
        

    }
public void Case2sepetkontrolet()
{
    Actions action = new Actions(driver);
    WebElement saticibekle = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'https://www.hepsiburada.com/magaza/GEN%C3%87AY%20OF%C4%B0S%20KIRTAS%C4%B0YE')]")));
    action.moveToElement(saticibekle);
    String satici1 = driver.findElement(By.xpath("//a[contains(@href, 'https://www.hepsiburada.com/magaza/GEN%C3%87AY%20OF%C4%B0S%20KIRTAS%C4%B0YE')]")).getText();
    String satici11 = "Gençay Ofi̇S Kirtasi̇Ye";
    Assert.assertEquals(satici1,satici11);
    String satici2 = driver.findElement(By.xpath("//a[contains(@href, 'https://www.hepsiburada.com/magaza/ENHASF%C4%B0YAT')]")).getText();
    String satici22 = "Enhasfi̇Yat";
    Assert.assertEquals(satici2,satici22);
}

}
