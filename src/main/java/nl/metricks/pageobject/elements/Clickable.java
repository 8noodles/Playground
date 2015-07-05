package nl.metricks.pageobject.elements;

public interface Clickable<T> extends IWebElement<T>, Returnable<T> {

    default Clickable<T> click() {
        find().click();
        return this;
    }
}