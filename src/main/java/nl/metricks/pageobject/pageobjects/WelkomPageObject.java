package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.elements.Clickable;

public class WelkomPageObject extends PageObject<WelkomPageObject> {
    public Clickable<WelkomPageObject> vervoer, wonen, overig;

    {
        overig = () -> xpath(".//a[text()='Overig']");
    }
}
