package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By LeftFrame = By.linkText("https://the-internet.herokuapp.com/frame_left");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public void SwitchToFrame (String text){
        SwitchToMainArea();
        driver.switchTo().frame(text);
        SwitchToMainArea();
    }

    public void SwitchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
