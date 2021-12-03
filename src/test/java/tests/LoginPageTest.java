package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pac.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    private WebDriver driver;


    @BeforeEach
    void before() {
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://lmslite47vr.demo.mirapolis.ru/mira");

    }


    @AfterEach
    void after() {
        if (driver != null)
            driver.quit();
    }

    @Test
    @DisplayName("Авторизация")
    void login(){
        LoginPage lg= new LoginPage(driver);
        lg.login();
    }
    @Test
    @DisplayName("Получене загловка страницы авторизации")
    void headingtext(){
        LoginPage lg= new LoginPage(driver);
        lg.getheading();
        assertEquals(lg.getheading(),"Вход в систему"); // Проверка текста заголовка

    }



}



