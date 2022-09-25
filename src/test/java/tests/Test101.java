package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class Test101 {

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("AUrl"));

        A101Page a101Page = new A101Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

        a101Page.cerezKabulEt.click();

        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);

        actions.moveToElement(a101Page.giyim_aksesuar).click().perform();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(a101Page.kadin_ic_giyim)).click();

       // Thread.sleep(2000);
        a101Page.dizalti_corap.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        a101Page.siyahSec.click();
       // Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        a101Page.ilkCorap.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(a101Page.urunBaslik.getText().contains(ConfigReader.getProperty("urunRengi")), "Urunumuz istedigimiz renk'de degil!");

        //wait.until(ExpectedConditions.elementToBeClickable(a101Page.sepeteEkle)).click();
        a101Page.sepeteEkle.click();
        a101Page.sepetiGoruntule.click();
        a101Page.sepetiOnayla.click();
        a101Page.uyeOlmadanDevamEt.click();
        a101Page.emailBox.click();
        a101Page.emailBox.sendKeys(ConfigReader.getProperty("email"));
        a101Page.devamEt.click();
        a101Page.yeniAdresOlustur.click();

        a101Page.adresBasligi.click();
        Faker faker = new Faker();
        a101Page.adresBasligi.sendKeys(faker.address().fullAddress());
        actions.sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("telefon")).perform();
        a101Page.ilDropDown.sendKeys(ConfigReader.getProperty("il"));
        actions.sendKeys(Keys.TAB).perform();
        Select select = new Select(a101Page.ilceDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("ilce"));
        select = new Select(a101Page.mahalleDropDown);
        Thread.sleep(2000);
        select.selectByVisibleText(ConfigReader.getProperty("mahalle"));
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.address().fullAddress()).perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        actions.click(a101Page.kaydetVeDevamEt).perform();

        Thread.sleep(2000);
        actions.moveToElement(a101Page.kaydetVdevamEtOdeme).click().perform();
        Assert.assertTrue(a101Page.odemeSecenekleri.isDisplayed());


    }
}
