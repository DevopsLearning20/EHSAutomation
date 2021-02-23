package StepDefinations;

import com.pages.EHSAllItem;
import com.pages.EHSItem;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class SpecificProductSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(SpecificProductSteps.class));
    private String pageTitle = "";
    private EHSItem item = new EHSItem(DriverFactory.getDriver());
    private EHSAllItem allItem = new EHSAllItem(DriverFactory.getDriver());


    @When("User click on Open button for item")
    public void userClickOnOpenButtonForItem() {
        allItem.navigateOnItem1();

    }

    @Then("ehs item page should be display")
    public void ehsItemPageShouldBeDisplay() {
        Assert.assertEquals(item.getPageName(),"EHS - Item");
        LOGGER.info(item.getPageName() );
    }

    @And("Item should have {string}{string}{string}{string}{string}")
    public void itemShouldHave(String pi, String name, String material, String mf, String retailP) {

        Assert.assertEquals(item.getProductName(),pi);
        Assert.assertEquals(item.getName(),name);
        Assert.assertEquals(item.getMaterial(),material);
        Assert.assertEquals(item.getManufacture(),mf);
        Assert.assertEquals(item.getRetail(),retailP);
        LOGGER.info(item.getProductName()+""+item.getName()+""+item.getMaterial()+""+item.getManufacture()+""+item.getRetail() );

    }

    @When("user gets the title of the page")
    public void userGetsTheTitleOfThePage() {
       String pageTitle = item.getPageName();

    }

    @Then("page title should be {string}")
    public void pageTitleShouldBe(String title) {

        Assert.assertEquals(pageTitle,title);
    }
}
