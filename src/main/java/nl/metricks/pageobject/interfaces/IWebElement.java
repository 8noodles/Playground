package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;
import org.openqa.selenium.WebElement;

import static nl.metricks.pageobject.PageObject.*;

@FunctionalInterface
public interface IWebElement<T extends PageObject> {

    WebElement find();

    default WebElement getWebElement() {
        return element;
    }

    default <O> O returns(O o) {
        if (o instanceof PageObject)
            page = (PageObject) o;
        return o;
    }

    default <P extends PageObject> P returns(Class<P> c) throws InstantiationException, IllegalAccessException {
        return load(c);
    }

    default T and() {
        return (T) page;
    }
}