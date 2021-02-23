package StepDefinations;

import com.pages.EHSAllItem;
import com.pages.EHSHome;
import com.qa.factory.DriverFactory;
import com.qa.util.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class EHSHomeSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EHSHomeSteps.class));

    private static int itemcount;
    private EHSHome home = new EHSHome(DriverFactory.getDriver());
    private EHSAllItem allItem = new EHSAllItem(DriverFactory.getDriver());

    @Given("launch the application")
    public void launchTheApplication() {
        LOGGER.info("Page Url =" + Constant.INDEX);
        DriverFactory.getDriver().get(Constant.INDEX);
    }

    @Given("User is on all list item screen")
    public void userIsOnAllListItemScreen() {
        home.clickOnListAllItem();
    }

    @When("User capture all the list info")
    public void userCaptureAllTheListInfo() {
        allItem.getEhsItems();

    }

    @Then("all item should be visible on the screen")
    public void allItemShouldBeVisibleOnTheScreen() {
        Assert.assertTrue(allItem.getCountOfTotalItem() == 9);
    }

    @When("User counts the total items")
    public void userCountsTheTotalItems() {
        itemcount = allItem.getCountOfTotalItem();

    }

    @Then("Total counts should be {int}")
    public void totalCountsShouldBe(int count) {
        Assert.assertEquals(itemcount, count);
    }

    @Then("home page title should be {string}")
    public void homePageTitleShouldBe(String tile) {
        Assert.assertEquals(home.getPageTitle(), tile);
    }

    @Given("user on EHS all items page")
    public void userOnEHSAllItemsPage() {
        home.clickOnListAllItem();
    }

    @Then("all item page title should be {string}")
    public void allItemPageTitleShouldBe(String title) {
        Assert.assertEquals(allItem.getPageName(), title);
    }

    @When("validate the productId label input field Find button and list all items button")
    public void validateTheProductIdLabelInputFieldFindButtonAndListAllItemsButton() {
    }

    @Then("productId element should be visible on page")
    public void productidElementShouldBeVisibleOnPage() {
        Assert.assertEquals(home.getTextBoxLabel(), "Product id:");
    }

    @And("user should see the clickable input field")
    public void userShouldSeeTheClickableInputField() {
        Assert.assertTrue("Input Text box is visible", home.isDisplayTextBox());
    }

    @And("find button should be display on the screen")
    public void findButtonShouldBeDisplayOnTheScreen() {
        Assert.assertTrue("Find Button click able", home.isDisplayFindButton());
    }

    @And("list all item button should be clickable on screen")
    public void listAllItemButtonShouldBeClickableOnScreen() {
        Assert.assertTrue("List all Item Button Displayed", home.isDisplayListAllButton());
    }
}
