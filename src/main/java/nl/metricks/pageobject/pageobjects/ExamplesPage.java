package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Clickable;
import org.openqa.selenium.By;

public class ExamplesPage extends PageObject<ExamplesPage> {

    public Clickable<ExamplesPage> checkboxes, dropdown;

    {
        checkboxes = () -> locate(By.xpath(".//*[@href='/checkboxes']"));
        dropdown = () -> locate(By.xpath(".//*[@href='/dropdown']"));
    }
}