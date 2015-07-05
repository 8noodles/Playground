package nl.metricks.pageobject;

import nl.metricks.pageobject.interfaces.Scenario;
import nl.metricks.pageobject.pageobjects.CheckboxesPageObject;
import nl.metricks.pageobject.pageobjects.DropdownPageObject;
import nl.metricks.pageobject.pageobjects.ExamplesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.Predicate;

import static nl.metricks.pageobject.PageObject.element;
import static nl.metricks.pageobject.PageObject.load;

public class PageObjectTest {
    private WebDriver driver;
    Scenario<String> checkboxes, dropdown;

    Predicate<String> title = s -> driver.getTitle().equals(s);
    Predicate<WebElement> selected = WebElement::isSelected;


    @BeforeTest
    public void setUp() {
        driver = PageObject.driver = new HtmlUnitDriver();
    }

    @BeforeMethod
    public void navigateToPage() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
    }

    @Test
    public void checkboxesTest() throws InstantiationException, IllegalAccessException {
        checkboxes = () ->
                load(ExamplesPage.class).test(title.test("The Internet"))
                        .checkboxes.click().returns(CheckboxesPageObject.class)
                        .checkbox1.click().test(selected.test(element))
                        .checkbox2.click().test(!selected.test(element))
                        .output("Success!");

        System.out.println("checkboxesTest: " + checkboxes.execute());
    }

    @Test
    public void dropdownListTest() throws InstantiationException, IllegalAccessException {
        dropdown = () ->
                load(ExamplesPage.class).test(title.test("The Internet"))
                        .dropdown.click().returns(DropdownPageObject.class)
                        .dropdown.select("Option 1")
                        .output("Success!");

        System.out.println("dropdownListTest: " + dropdown.execute());
    }
}
