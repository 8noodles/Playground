package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Clickable;
import org.openqa.selenium.By;

public class CheckboxesPageObject extends PageObject<CheckboxesPageObject> {
    public Clickable<CheckboxesPageObject> checkbox1, checkbox2;

    {
        checkbox1 = () -> locate(By.xpath(".//*[@type ='checkbox'][1]"));
        checkbox2 = () -> locate(By.xpath(".//*[@type ='checkbox'][2]"));
    }
}
