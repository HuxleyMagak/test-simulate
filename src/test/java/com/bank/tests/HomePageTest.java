package com.bank.tests;

import com.bank.page.HomePage;
import com.bank.factory.DriverFactory;
import com.bank.utils.ConfigReader;
import org.testng.annotations.*;

public class HomePageTest {
    @BeforeMethod
    public void setup(){
        DriverFactory.initDriver();
        DriverFactory.getDriver().get(ConfigReader.get("base.url"));
    }

    @Test

    public void verifyHeaderNavigation(){
        HomePage homePage = new HomePage();

      //  homePage.clickHome();
        homePage.hoverPersonal();
        homePage.hoverBusiness();
        homePage.hoverDiaspora();
        homePage.hoverAboutUs();
        homePage.hoverPersonal();
        homePage.hoverCards();
        homePage.clickCreditCard();
        homePage.scrollToBankCreditCard();
        homePage.clickRightButton();
        homePage.clickGoldCreditCard();
    }

    @AfterMethod
    public void teardown(){
        DriverFactory.quitDriver();
    }
}
