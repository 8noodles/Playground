package nl.metricks.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

public abstract class PageObject<T extends PageObject> {

    public static WebDriver driver;
    public static PageObject page = null;
    public static WebElement element = null;

    public static <T extends PageObject> T load(Class<T> c) throws IllegalAccessException, InstantiationException {
        page = c.newInstance();
        return (T) page;
    }

    public WebElement locate(By by) {
        return element = driver.findElement(by);
    }

    public T test(boolean expectation) {
        assertTrue(expectation);
        return (T) page;
    }
}