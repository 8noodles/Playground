package nl.metricks.pageobject.elements;

import nl.metricks.pageobject.PageObject;

import static nl.metricks.pageobject.PageObject.getCurrentPage;
import static nl.metricks.pageobject.PageObject.setCurrentPage;

public interface Returnable<T extends PageObject> {

    default <O> O returns(O o) {
        if (o instanceof PageObject)
            setCurrentPage((PageObject) o);
        return o;
    }

    default T and() {
        return (T) getCurrentPage();
    }
}
