package nl.metricks.pageobject.elements;

import org.openqa.selenium.WebElement;

public interface IWebElement {
    WebElement find();

    default WebElement getWebElement() {
        return (WebElement) this;
    }
}