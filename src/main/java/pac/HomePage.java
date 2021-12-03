package pac;

import org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private static WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class=\"widgetHeaderWrap mira-widget-header-wrapper\"]//div[@title=\"Мой статус\"]")
    WebElement statusHeading;
    @FindBy(xpath = "//div[@class=\"widgetHeaderWrap mira-widget-header-wrapper\"]//div[@title=\"Место в рейтинге\"]")
    WebElement ratingHeading;
    @FindBy(xpath = "//div[@class=\"widgetHeaderWrap mira-widget-header-wrapper\"]//div[@title=\"Мои сертификаты\"]")
    WebElement certificatesHeading;
    @FindBy(xpath = "//div[@class=\"widgetHeaderWrap mira-widget-header-wrapper\"]//div[@title=\"Мои опросы\"]")
    WebElement questionsHeading;
    @FindBy(xpath = "//span[@class=\"mira-vertical-portal-menu-fixer-title\"]")
    WebElement menu;
    @FindBy(xpath = "//ul[@class=\"mira-vertical-portal-menu-items-wrapper level-1\"]/li[4]/div/div")
    WebElement calendar;
    @FindBy(xpath = "//div[@class=\"mira-bread_crumbs-caption caption\"]")
    WebElement calendarHiding;
    @FindBy(xpath = "//ul[@class=\"mira-vertical-portal-menu-items-wrapper level-1\"]/li[5]/div")
    WebElement mediathek;
    @FindBy(xpath = "//div[@class=\"path-state-name mira-bread_crumbs-object\"]")
    WebElement mediathekHeading;
    @FindBy(xpath = "//div[@class=\"avatar-full-current-role\"]")
    WebElement employee;
    @FindBy (xpath = "//div[@class=\"mira-user-info-logout\"]/a/span[2]")
    WebElement logout;



    public String  getstatusHeading(){
        System.out.println(statusHeading.getText());
        return statusHeading.getText();
    }
    public String  getratingHeading(){
        System.out.println(ratingHeading.getText());
        return ratingHeading.getText();
    }
    public String  getcertificatesHeading(){
        System.out.println(certificatesHeading.getText());
        return certificatesHeading.getText();
    }
    public String  getquestionsHeading(){
        System.out.println(questionsHeading.getText());
        return questionsHeading.getText();
    }
    public HomePage openmenu(){
        menu.click();
        return this;
    }
    public HomePage calendar(){
        calendar.click();
        return new HomePage(driver);
    }
    public String getcalendatHiding(){
        System.out.println(calendarHiding.getText());
        return calendarHiding.getText();
    }
    public HomePage mediathek(){
        mediathek.click();
        return this;
    }
    public String getmediatekHiding(){
        System.out.println(mediathekHeading.getText());
        return mediathekHeading.getText();
    }

    public HomePage employee(){
        employee.click();
        return this;
    }
    public HomePage logout(){
        employee.click();
        logout.click();
        return this;
    }

}
