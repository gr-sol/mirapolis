package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class LoginPage

{ private static WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"login_form_panel\"]/table[1]/tbody/tr[1]/td[2]/input")
    WebElement login;
    @FindBy(xpath = "//*[@id=\"login_form_panel\"]/table[1]/tbody/tr[2]/td[2]/div/input")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"button_submit_login_form\"]")
    WebElement loginbutton;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div[2]/div/div")
    WebElement heading;

    public LoginPage login(){
        login.sendKeys("fominaelena");
        password.sendKeys("1P73BP4Z");
        loginbutton.click();
        return new LoginPage(driver);
    }

    public String getheading(){
        System.out.println(heading.getText());
        return heading.getText();

    }





}
