package com.pages;

import com.qa.util.ElementUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * EHSHome class used for index page methods and elements path
 */

public class EHSHome{

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EHSHome.class));

    private WebDriver driver;
    private ElementUtils elementUtil;

    //Webpage Element Path

    private By pageName = By.xpath("//tbody/tr[1]/th");
    private By label_productId = By.xpath("//tbody/tr[2]/td[1]");
    private By input_text = By.xpath("//input[@id=\"ProductIdField\"]");
    private By btn_find = By.xpath("//input[@id=\"FindItemButton\"]");
    private By btn_listAllItem = By.xpath("//input[@id=\"ListAllItemsButton\"]");

    //Constructor of the page class
    public EHSHome(WebDriver driver)
    {
        this.driver = driver;
        elementUtil = new ElementUtils(this.driver);
    }

    //Page action :: feature of the page

    // Get page Title
    public String getPageTitle() {
        LOGGER.info("Validating login page Title");
        return driver.getTitle();
    }

    //Display Find button
    public boolean isDisplayFindButton()
    {
        LOGGER.info("Validating the Find Button Display");
        return driver.findElement(btn_find).isDisplayed();
    }

    //Display list all button
    public boolean isDisplayListAllButton()
    {
        LOGGER.info("Validating the Display List all button");
        return driver.findElement(btn_listAllItem).isDisplayed();
    }

    //Display TextBox
    public boolean isDisplayTextBox()
    {
        LOGGER.info("Validating the Display Input Text Box");
        return driver.findElement(input_text).isDisplayed();
    }

    //Get Text Box Label
    public String getTextBoxLabel()
    {
        LOGGER.info("Validating Product Label");
       return driver.findElement(label_productId).getText();
    }


    //Search product By ItemId
    public void searchProductId(String itemId)
    {
        LOGGER.info("Searching Product id");
        driver.findElement(input_text).sendKeys(itemId);
        driver.findElement(btn_find).click();
    }

    //Search Without Id
    public void searchProductId()
    {
        LOGGER.info("Searching with out Product id");
        driver.findElement(btn_find).click();
    }

    //Click on List all Items

    public void clickOnListAllItem()
    {
        LOGGER.info("Clicks on list of all button");
        driver.findElement(btn_listAllItem).click();
    }


}