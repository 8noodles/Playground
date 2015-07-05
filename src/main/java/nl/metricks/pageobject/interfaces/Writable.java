package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;

@FunctionalInterface
public interface Writable<T> extends IWebElement<T> {

    default T write(String s) {
        find().sendKeys(s);
        return (T) PageObject.page;
    }
}
