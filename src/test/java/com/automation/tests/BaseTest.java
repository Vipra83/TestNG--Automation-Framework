package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public abstract class BaseTest {


    LoginPage loginPage;
    HomePage homePage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ReviewPage reviewPage;
    OrderConfirmationPage orderConfirmationPage;


    @BeforeMethod
    public void setUp()  {
        DriverUtils.createDriver();
         loginPage = new LoginPage();
         homePage = new HomePage();
         productDetailsPage = new ProductDetailsPage();
         cartPage = new CartPage();
         checkoutPage = new CheckoutPage();
         reviewPage = new ReviewPage();
         orderConfirmationPage = new OrderConfirmationPage();

    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.getDriver().quit();

    }
}
