package nl.metricks.pageobject;

import nl.metricks.pageobject.elements.Returnable;
import nl.metricks.pageobject.pageobjects.WelkomPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.fest.assertions.Assertions.assertThat;

public abstract class PageObject<T extends PageObject> implements Returnable {

    public static WebDriver driver;
    private static PageObject currentPage = new WelkomPageObject();

    public static PageObject getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(PageObject currentPage) {
        PageObject.currentPage = currentPage;
    }

    public WebElement xpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public T test(boolean result) {
        assertThat(result).isTrue();
        return (T) currentPage;
    }
}