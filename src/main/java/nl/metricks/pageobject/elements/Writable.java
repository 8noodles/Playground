package nl.metricks.pageobject.elements;

public interface Writable<T> extends IWebElement<T>, Returnable<T> {

    default Writable<T> write(String s) {
        find().sendKeys(s);
        return this;
    }
}
