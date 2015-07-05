package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Clickable;
import nl.metricks.pageobject.interfaces.Writable;
import org.openqa.selenium.By;

public class GegevensAansprakelijkheidPageObject extends PageObject<GegevensAansprakelijkheidPageObject> {
    
    public Writable<GegevensAansprakelijkheidPageObject> postcodecijfers, postcodeletters;
    public Clickable<GegevensAansprakelijkheidPageObject> samenwonend, alleenwonend, berekenen;

    {
        postcodecijfers = () -> locate(By.xpath(".//*[@id='postcodecijfers']"));
        postcodeletters = () -> locate(By.xpath(".//*[@id='postcodeletters']"));
        samenwonend = () -> locate(By.xpath(".//*[@id='gezinssituatie1']"));
        alleenwonend = () -> locate(By.xpath(".//*[@id='gezinssituatie2']"));
        berekenen = () -> locate(By.xpath(".//*[@id='nextButton2']"));
    }
}