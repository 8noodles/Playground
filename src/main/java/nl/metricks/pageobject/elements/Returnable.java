package nl.metricks.pageobject.elements;

import nl.metricks.pageobject.PageObject;

public interface Returnable<T> {

    default <O> O returns(O o) {
        if (o instanceof PageObject)
            PageObject.setCurrentPage((PageObject) o);
        return o;
    }

    default T and() {
        return (T) PageObject.getCurrentPage();
    }
}
