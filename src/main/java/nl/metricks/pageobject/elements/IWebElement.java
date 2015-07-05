package nl.metricks.pageobject.elements;

import org.openqa.selenium.WebElement;

public interface IWebElement<T> {
    WebElement find();

    default WebElement getWebElement() {
        return (WebElement) this;
    }
}