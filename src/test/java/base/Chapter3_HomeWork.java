package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/***
 * Przejsc na strone i z policzyc przyciski
 */

public class Chapter3_HomeWork {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputLink = driver.findElement(By.linkText("Shifting Content"));
        inputLink.click();
        inputLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLink.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) {
       Chapter3_HomeWork test = new Chapter3_HomeWork();
        test.setUp();

    }

}
