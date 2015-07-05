package nl.metricks.pageobject.pageobjects;

import nl.metricks.pageobject.PageObject;
import nl.metricks.pageobject.elements.Clickable;

public class OverigPageObject extends PageObject<OverigPageObject> {

    public Clickable<OverigPageObject> aansprakelijkheid, rechtsbijstand,
            gezinsongevallen, reis, annulering;

    {
        aansprakelijkheid = () -> xpath(".//a[text()='Aansprakelijkheid']");
    }
}
