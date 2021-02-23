package StepDefinations;

import com.pages.EHSHome;
import com.pages.EHSItem;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class StoryThreeSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(StoryThreeSteps.class));

    private EHSHome home = new EHSHome(DriverFactory.getDriver());
    private EHSItem itemDesc = new EHSItem(DriverFactory.getDriver());

    @Then("user should get warning {string}")
    public void userShouldGetWarning(String warning) {
        Assert.assertEquals(itemDesc.getWarning(),warning);
        LOGGER.info("Warning Message " +itemDesc.getWarning());

    }

    @When("user click on find button without enter product id")
    public void userClickOnFindButtonWithoutEnterProductId() {
        home.searchProductId();
    }

    @When("user enters the valid product id {string}")
    public void userEntersTheValidProductId(String product) {

        home.searchProductId(product);
    }

    @Then("user should get the product id {string}")
    public void userShouldGetTheProductId(String product) {
        Assert.assertEquals(itemDesc.getProductName(),product);

    }

    @When("user enters the Invalid product id {string}")
    public void userEntersTheInvalidProductId(String product) {

        home.searchProductId(product);
    }
}
