package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.interfaces.Clickable;
import org.openqa.selenium.By;

public class OverigPageObject extends PageObject<OverigPageObject> {

    public Clickable<OverigPageObject> aansprakelijkheid, rechtsbijstand,
            gezinsongevallen, reis, annulering;

    {
        aansprakelijkheid = () -> locate(By.xpath(".//a[text()='Aansprakelijkheid']"));
    }
}
