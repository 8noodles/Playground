package nl.metricks.pageobject.interfaces;

import nl.metricks.pageobject.PageObject;
import org.openqa.selenium.support.ui.Select;

public interface Selectable<T> extends IWebElement<T> {

    default T select(String s) {
        Select select = new Select(find());
        select.selectByVisibleText(s);
        return (T) PageObject.page;
    }
}