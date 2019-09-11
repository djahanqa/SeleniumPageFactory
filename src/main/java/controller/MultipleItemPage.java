package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultipleItemPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;
    @FindBy(xpath = "//*[@class='form-control attribute_select no-print']")
    WebElement size;
    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement home;
    @FindBy(css = "#//*[@id='quantity_wanted_p']//span/i[@class='icon-plus']")
    WebElement cartQuantity;
    @FindBy(xpath = "//*/a[@class='btn btn-default button-plus product_quantity_up']")
    WebElement addingItems;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]//a[@title='Printed Dress']")
    WebElement printedDress;


    public MultipleItemPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void multipleItemAdded(String products, WebDriver driver) throws InterruptedException {
        homepage.click();
        mouseOver(driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")), driver);
        Thread.sleep(5000);

       driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")).click();


    }

    public void changeSize(WebDriver driver,String products, int quantity,String sizes) throws InterruptedException {
        homepage.click();
        mouseOver(printedDress, driver);
        Thread.sleep(5000);
        printedDress.click();
        multipleItemAdded(products,driver);
        productQuantity(addingItems,quantity);
        dropdown(size,sizes);

    }
    public void changeQuantity(WebDriver driver,String products, int quantity) throws InterruptedException {
        homepage.click();
        Thread.sleep(5000);
        multipleItemAdded(products, driver);
        Thread.sleep(5000);
       productQuantity(addingItems,quantity);

    }
public void changeDressSize(WebDriver driver,String sizes){
        driver.findElement(By.xpath("//*[@class='"+sizes+"']")).isSelected();

}

    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();
    }

    public void dropdown(WebElement element, String value) {
        element = size;
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    private void productQuantity(WebElement element, int quantity) {
        for (int i = 0; i < quantity; i++) {
            element.click();

        }


    }
}