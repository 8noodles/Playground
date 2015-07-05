package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Selectable;
import org.openqa.selenium.By;

public class DropdownPageObject extends PageObject<DropdownPageObject> {
    public Selectable<DropdownPageObject> dropdown;

    {
        dropdown = () -> locate(By.xpath(".//*[@id='dropdown']"));
    }
}
