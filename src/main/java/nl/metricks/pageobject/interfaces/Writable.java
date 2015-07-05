package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;

@FunctionalInterface
public interface Writable<T extends PageObject> extends IWebElement<T> {

    default Writable<T> write(String s) {
        find().sendKeys(s);
        return this;
    }
}
