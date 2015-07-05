package nl.metricks.pageobject.interfaces;

import org.openqa.selenium.WebElement;

@FunctionalInterface
public interface IWebElement<T> {

    WebElement find();

    default String text() {
        return find().getText();
    }
}