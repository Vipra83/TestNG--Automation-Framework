package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderConfirmationPage extends BasePage {

    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement orderConfirmationTitle;


    public void verifyPage() {
        Assert.assertTrue(orderConfirmationTitle.isDisplayed(),"order confirmation title is missing from Order Confirmation page");
        String actText = orderConfirmationTitle.getText();
        String expText = PropertyReader.getProperty("order.confirmation.title");
        Assert.assertTrue(actText.equals(expText),"Expected confirmation text is "+expText+" :Actual "+actText);
    }
}
