package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogoutTest extends BaseTest {

    @Test
    public void userCanLogoutFromApp()  {

        loginPage.doLogin();

        homePage.verifyPage();

        homePage.clickOnBurgerMenu();

        homePage.clickOnLogoutLink();

        loginPage.verifyPage();


    }



}