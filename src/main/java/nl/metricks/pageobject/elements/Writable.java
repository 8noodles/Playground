package nl.metricks.pageobject.elements;

import nl.metricks.pageobject.PageObject;

public interface Writable<T extends PageObject>
        extends IWebElement, Returnable<T> {

    default Writable<T> write(String s) {
        find().sendKeys(s);
        return this;
    }
}
