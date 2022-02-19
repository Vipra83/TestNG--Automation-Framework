package com.automation.tests;
import org.testng.annotations.Test;
//        HomeAssignment
//        1. Open website https://www.saucedemo.com/
//        2. Do Login & verify home page
//        3. Click on Item - Sauce Labs Backpack
//        4. Verify product details page
//        5. Click on add to cart button
//        6. Click on cart icon
//        7. Verify Cart Page
//        8. Click on Checkout
//        9. Fill checkout details & click on Continue
//        10. Verify Review Page
//        11. Click on finish
//        12. Verify order confirmation page



public class EndToEndTest extends BaseTest{

    @Test
    public void verifyUserCanPlaceOrder(){
        loginPage.doLogin();
        homePage.verifyPage();
        homePage.clickOnItem();
        productDetailsPage.verifyPage();
        productDetailsPage.clickOnAddToCartBtn();
        productDetailsPage.clickOnCartIcon();
        cartPage.verifyPage();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.verifyPage();
        checkoutPage.fillCheckoutDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.verifyPage();
        reviewPage.clickOnFinishBtn();
        orderConfirmationPage.verifyPage();
    }

}
