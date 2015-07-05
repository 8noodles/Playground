package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;

@FunctionalInterface
public interface Clickable<T extends PageObject> extends IWebElement<T> {

    default Clickable<T> click() {
        find().click();
        return this;
    }
}