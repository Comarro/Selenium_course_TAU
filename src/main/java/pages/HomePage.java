package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //no longer needed - clickLink it is now private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){

        // stare_driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider () {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public ContextMenuPage clickContextMenu (){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public NestedFramesPage clickNestedFramesPage(){
        clickLink("Frames");
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }



    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
