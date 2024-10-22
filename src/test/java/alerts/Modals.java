package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Modals extends BaseTest {

    @Test
    public void testClickContextMenu (){
        var ContextMenuPage = homePage.clickContextMenu();
        ContextMenuPage.RightClick();
        assertEquals(ContextMenuPage.alert_getText(),"You selected a context menu" , "Result text incorrect");
        ContextMenuPage.alert_clickToDismiss();
    }

}
