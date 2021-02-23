package com.pages;

import com.qa.util.ElementUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/***
 * This class used to write element path and actions of the page which is used in step definition for EHSAllItem
 */
public class EHSAllItem{

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EHSAllItem.class));

    private WebDriver driver;
    private ElementUtils elementUtil;


    //Webpage Element Path

    private By pageName = By.xpath("//tbody/tr[1]/th");
    private By listOfItem = By.xpath("//tbody/tr/td[1]");
    private By OpenButtonList = By.xpath("//tbody/tr/td[2]");
    private By navigateOnItem1 = By.xpath("//input[@id=\"OpenItem1Button\"]");


    //Constructor of the page class
    public EHSAllItem(WebDriver driver)
    {
        this.driver = driver;
        elementUtil = new ElementUtils(this.driver);
    }

    // Method for total count of item
   public int getCountOfTotalItem(){
       LOGGER.info("Validating total count of items");
    return driver.findElements(listOfItem).size();

   }

   //Method for validate EHS item as list
   public void getEhsItems()
   {
       LOGGER.info("Validating Item Count");
      List<WebElement> ehsItems = driver.findElements(listOfItem);
      for(WebElement ele: ehsItems)
      {
          System.out.println(ele.getText());
          LOGGER.info("ItemName = " +ele.getText());
      }
   }

   //Action for navigation
   public void navigateOnItem1()
   {
       LOGGER.info("Navigating on first item on click open Button");
       driver.findElement(navigateOnItem1).click();
   }

   //Action for get page name
   public String getPageName()
   {
       return driver.findElement(pageName).getText();
   }



}