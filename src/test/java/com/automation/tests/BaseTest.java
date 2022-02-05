package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    WebDriver driver;


    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();

    }
}
