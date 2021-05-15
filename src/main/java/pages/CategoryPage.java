package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.Constants.BASE_URL;

public class CategoryPage extends BasePage{
    public CategoryPage(){
        super();
        DriverProvider.INSTANCE.getDriver().navigate().to(BASE_URL);
    }

    @FindBy(xpath = "//a[contains(@href,\"168814171\")]")
    private WebElement galaxyBlackPhone;

    @FindBy(css = "[name=\"search\"]")
    private WebElement searchImLookingFor;

    @FindBy(className = "search-form__submit")
    private WebElement findButton;

    @FindBy(className = "goods-tile__title")
    private List<WebElement> products;

    public ProductPage clickOnMobilePhone(){
        galaxyBlackPhone.click();
        return new ProductPage();
    }

    public void typeValueIntoImLookingForField(String searchWord){
        searchImLookingFor.sendKeys(searchWord);
    }

    public void clickFindButton(){
        findButton.click();
    }

    public List<WebElement> getProducts(){
        return products;
    }

    @Override
    void waitForLoad() {

    }
}
