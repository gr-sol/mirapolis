package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pac.HomePage;
import pac.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest {

    private WebDriver driver;


    @BeforeEach
    void before() {
        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://lmslite47vr.demo.mirapolis.ru/mira");
        LoginPage lg = new LoginPage(driver);
        lg.login();

    }


    @AfterEach
    void after() {
        if (driver != null)
            driver.quit();
    }

    @Test
    @DisplayName("Получене загловка Статуса")
    void headingtextstatus() {
        HomePage hm = new HomePage(driver);
        hm.getstatusHeading();
        assertEquals(hm.getstatusHeading(), "Мой статус"); // Проверка текста заголовка

    }

    @Test
    @DisplayName("Получене загловка Рейтинга")
    void headingtextrating() {
        HomePage hm = new HomePage(driver);
        hm.getratingHeading();
        assertEquals(hm.getratingHeading(), "Место в рейтинге"); // Проверка текста заголовка

    }

    @Test
    @DisplayName("Получене загловка Сертификаты")
    void headingtextcrtifikates() {
        HomePage hm = new HomePage(driver);
        hm.getcertificatesHeading();
        assertEquals(hm.getcertificatesHeading(), "Мои сертификаты"); // Проверка текста заголовка

    }

    @Test
    @DisplayName("Получене загловка Опросы")
    void headingtextquestion() {
        HomePage hm = new HomePage(driver);
        hm.getquestionsHeading();
        assertEquals(hm.getquestionsHeading(), "Мои опросы"); // Проверка текста заголовка

    }

    @Test
    @DisplayName("Открытие меню")
    void menubuttons() {
        HomePage hm = new HomePage(driver);
        hm.openmenu();

    }

    @Test
    @DisplayName("Переход из меню в календарь ")
    void calendar() {
        HomePage hm = new HomePage(driver);
        hm.openmenu();
        hm.calendar();

    }
    @Test
    @DisplayName("Переход из меню в календарь и проверка заголовка")
    void calendarHiding() {
        HomePage hm = new HomePage(driver);
        hm.openmenu();
        hm.calendar();
        hm.getcalendatHiding();
        assertEquals(hm.getcalendatHiding(), "Календарь");

    }
    @Test
    @DisplayName("Переход из меню в медиатеку")
    void mediatek(){
        HomePage hm = new HomePage(driver);
        hm.openmenu();
        hm.mediathek();

    }
    @Test
    @DisplayName("Переход из меню в медиатеку и проверка загаловка")
    void mediatekHididng(){
        HomePage hm = new HomePage(driver);
        hm.openmenu();
        hm.mediathek();
        hm.getmediatekHiding();
        assertEquals(hm.getmediatekHiding(),"Медиатека");

    }
    @Test
    @DisplayName("Авторизаци и выход")
    void logout(){
        HomePage hm = new HomePage(driver);
        hm.logout();

    }
}