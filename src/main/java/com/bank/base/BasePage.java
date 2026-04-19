package com.bank.base;

import org.openqa.selenium.JavascriptExecutor;
import com.bank.factory.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
        this.driver.manage().window().maximize();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    protected WebElement find(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text){
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }

    protected String getText(By locator){
        return find(locator).getText();
    }

    protected boolean isDisplayed(By locator){
        try{
           return find(locator).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    protected void scrollTo(By locator){
        js.executeScript("arguments[0].scrollIntoView(true);", find(locator));
    }

    protected void selectDropdown (By locator, String visibleText){
        new Select(find(locator)).selectByVisibleText(visibleText);
    }

    protected void waitForInvisibility(By locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void hover(By locator){
    Actions actions = new Actions(driver);
    actions.moveToElement(find(locator)).perform();
    }
    protected void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
