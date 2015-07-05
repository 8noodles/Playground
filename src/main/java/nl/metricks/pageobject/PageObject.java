package nl.metricks.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

public abstract class PageObject<T extends PageObject> {

    public static WebDriver driver;
    public static PageObject page = null;
    public static WebElement element = null;

    public static <T extends PageObject> T load(Class<T> c) {
        try {
            page = c.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return (T) page;
    }

    public <T extends PageObject> T returns(Class<T> t) {
        return load(t);
    }

    public <T> T output(T t) {
        return t;
    }

    public WebElement locate(By by) {
        return element = driver.findElement(by);
    }

    public T test(boolean expectation) {
        assertTrue(expectation);
        return (T) page;
    }
}