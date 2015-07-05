package nl.metricks.pageobject.elements;

import nl.metricks.pageobject.PageObject;

public interface Clickable<T extends PageObject>
        extends IWebElement, Returnable<T> {

    default Clickable<T> click() {
        find().click();
        return this;
    }
}