package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;

@FunctionalInterface
public interface Clickable<T> extends IWebElement {

    default T click() {
        find().click();
        return (T) PageObject.page;
    }
}