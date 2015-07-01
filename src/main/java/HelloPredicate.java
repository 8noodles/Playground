import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.function.Predicate;

import static org.fest.assertions.Assertions.assertThat;

public class HelloPredicate {
    private static WebDriver driver;
    private static Predicate<String> expectedTitle;

    static {
        driver = new HtmlUnitDriver();
        expectedTitle = s -> driver.getTitle().equals(s);
    }

    public static void main(String[] args) {
        driver.navigate().to("http://www.google.nl");
        assertThat(expectedTitle.test("Google")).isTrue();
        driver.quit();
    }
}
