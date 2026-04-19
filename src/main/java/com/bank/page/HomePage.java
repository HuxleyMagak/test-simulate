package com.bank.page;

import org.openqa.selenium.By;

import com.bank.base.BasePage;
import com.bank.factory.DriverFactory;

public class HomePage extends BasePage {
   // private By home = By.xpath("//*[contains(text(),'Home')]");
    private By personal = By.xpath("//*[@id=\"menu-item-12094\"]");
    private By business = By.xpath("//*[@id=\"menu-item-12095\"]");
    private By diaspora = By.xpath("//*[@id=\"menu-item-12093\"]");
    private By aboutus = By.xpath("//*[@id=\"menu-item-12100\"]");
    private By cards = By.xpath("//*[@id=\"menu-item-16530\"]");
    private By creditcard = By.xpath("//*[@id=\"menu-item-16539\"]");
    private By bankcreditcard = By.xpath("//*[@id=\"page-wrap\"]/section[3]/div/div/div/div/div[1]/h2");
    private By rightbutton = By.xpath("//*[@id=\"page-wrap\"]/section[3]/div/div/div/div/div[4]/div[2]/div/i");
    private By goldcreditcard = By.xpath("//*[@id=\"swiper-wrapper-e31c9cd991531262\"]/div[7]/div/div/a/div[1]/h3/div");

  //  private By aboutusLink = By.linkText("About US");
    
  //  public void clickHome(){
  //      click(home);
  //  }

    public void hoverPersonal(){
        hover(personal);
        pause(500);
    }

    public void hoverBusiness(){
        hover(business);
        pause(500);
    }

    public void hoverDiaspora(){
        hover(diaspora);
        pause(2000);
    }

        public void hoverAboutUs(){
        hover(aboutus);
        pause(2000);
    }
        public void hoverCards(){
        hover(cards);
        pause(2000);
    }
        public void clickCreditCard(){
        click(creditcard);
        pause(2000);
    }
        public void scrollToBankCreditCard(){
        scrollTo(bankcreditcard);
        pause(2000);
    }
        public void clickRightButton(){
        click(rightbutton);
        pause(2000);
    }
        public void clickGoldCreditCard(){
        click(goldcreditcard);
        pause(2000);
    }
}
