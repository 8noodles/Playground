package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Clickable;
import org.openqa.selenium.By;

public class WelkomPageObject extends PageObject<WelkomPageObject> {
    public Clickable<WelkomPageObject> vervoer, wonen, overig;

    {
        overig = () -> locate(By.xpath(".//a[text()='Overig']"));
    }
}
