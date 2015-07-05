package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.elements.Clickable;
import nl.metricks.pageobject.elements.Writable;

public class GegevensAansprakelijkheidPageObject extends PageObject<GegevensAansprakelijkheidPageObject> {
    
    public Writable<GegevensAansprakelijkheidPageObject> postcodecijfers, postcodeletters;
    public Clickable<GegevensAansprakelijkheidPageObject> samenwonend, alleenwonend, berekenen;

    {
        postcodecijfers = () -> xpath(".//*[@id='postcodecijfers']");
        postcodeletters = () -> xpath(".//*[@id='postcodeletters']");
        samenwonend = () -> xpath(".//*[@id='gezinssituatie1']");
        alleenwonend = () -> xpath(".//*[@id='gezinssituatie2']");
        berekenen = () -> xpath(".//*[@id='nextButton2']");
    }
}
