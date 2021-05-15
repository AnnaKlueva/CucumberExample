package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public ProductPage(){
        super();
    }

    @FindBy(className = "product__title")
    private WebElement productTitle;

    public WebElement getProduct(){
        return productTitle;
    }

    @Override
    void waitForLoad() {

    }
}
