package nl.metricks.pageobject;

import nl.metricks.pageobject.pageobjects.GegevensAansprakelijkheidPageObject;
import nl.metricks.pageobject.pageobjects.OverigPageObject;
import nl.metricks.pageobject.pageobjects.WelkomPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.function.Predicate;

public class PageObjectTest {
    private WebDriver driver;
    Predicate<String> title = s -> driver.getTitle().equals(s);

    @BeforeClass
    public void setUp() {
        driver = PageObject.driver = new FirefoxDriver();
        driver.navigate().to("http://www.zlm.nl");
    }

    @Test
    public void executeScenario() {
        new WelkomPageObject()
            .test(title.test("U tevreden, wij tevreden | ZLM Verzekeringen"))
            .overig.click()

            .returns(new OverigPageObject())
                .aansprakelijkheid.click()

            .returns(new GegevensAansprakelijkheidPageObject())
                .test(title.test("Premieberekening aansprakelijkheid | ZLM Verzekeringen"))
                .postcodeletters.write("XH")
                .and().postcodecijfers.write("4463")
                .and().alleenwonend.click()
                .and().berekenen.click();
    }
}
