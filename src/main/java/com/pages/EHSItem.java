package com.pages;

import com.qa.util.ElementUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/***
 * EHSItem Class is used to handle all actions and webElements of itemDetails page
 */

public class EHSItem{

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EHSItem.class));

    private WebDriver driver;
    private ElementUtils elementUtil;


    //Webpage Element Path

    private By productId = By.xpath("//span[@id=\"ProductId\"]");
    private By name = By.xpath("//input[@id=\"NameField\"]");
    private By material = By.xpath("//input[@id=\"MaterialField\"]");
    private By ManufacturerField = By.xpath("//input[@id=\"ManufacturerField\"]");
    private By RetailPriceField = By.xpath("//input[@id=\"RetailPriceField\"]");
    private By itemPageName = By.xpath("//tbody/tr[1]/th");
    private By warning = By.xpath("//span[@id=\"ProductId\"]");


    //Constructor of the page class
    public EHSItem(WebDriver driver)
    {
        this.driver = driver;
        elementUtil = new ElementUtils(this.driver);

    }

    //Page Actions

    public String getProductName()
    {

        return driver.findElement(productId).getText();
    }

    //Method for getPage name
    public String getName()
    {
        String name = (String) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].value;",driver.findElement(By.xpath("//input[@id=\"NameField\"]")));
        return name;
    }

    // Method for get Material name Using javascript Executor
    public String getMaterial()
    {
        String material = (String) ((JavascriptExecutor) driver).
                executeScript("return arguments[0].value;",driver.findElement(By.xpath("//input[@id=\"MaterialField\"]")));
        return material;
    }

    // Method for get manufacture name Using javascript Executor
    public String getManufacture()
    {
        String maufacture = (String) ((JavascriptExecutor) driver).
                executeScript("return arguments[0].value;",driver.findElement(By.xpath("//input[@id=\"ManufacturerField\"]")));
        return maufacture;
    }

    // Method for get retails price using javascript Executor
    public String getRetail()
    {
        String price = (String) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].value;",driver.findElement(By.xpath("//input[@id=\"RetailPriceField\"]")));
        return price;
    }

    // Method for get page Name
    public String getPageName()
    {
        return driver.findElement(itemPageName).getText();
    }

    //Method for get Warning message
    public String getWarning()
    {
        return driver.findElement(warning).getText();
    }

}