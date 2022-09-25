package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {

    WebDriver driver;

    public A101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "//div[@onclick='persona_PopupClose();']")
    public WebElement gozAtX;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/'])[1]")
    public WebElement giyim_aksesuar;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    public WebElement kadin_ic_giyim;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/dizalti-corap/'])[2]")
    public WebElement dizalti_corap;

    @FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyahSec;

    @FindBy(xpath = "(//h3[@class='name'])[1]")
    public WebElement ilkCorap;

    @FindBy(tagName = "h1")
    public WebElement urunBaslik;

    @FindBy(xpath = "//button[@data-pk='18864']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public WebElement sepetiOnayla;


    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@class='button block green']")
    public WebElement devamEt;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    public WebElement yeniAdresOlustur;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligi;

    @FindBy(className = "js-cities")
    public WebElement ilDropDown;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilceDropDown;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalleDropDown;

    @FindBy(xpath = "//span[@id='line-error']")
    public WebElement adressBox;

    @FindBy(xpath = "//button[@class='js-masterpass-save-form']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEt;

    @FindBy(xpath = "(//input[@name='shipping'])[1]")
    public WebElement kargoRadio;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement kaydetVdevamEtOdeme;

    @FindBy(xpath = "(//span[@class='hidden-xs'])[2]")
    public WebElement odemeSecenekleri;



}
