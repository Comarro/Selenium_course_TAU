package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg(){
        var ediortPage = homePage.clickWysiwygEditor();
        ediortPage.clearTextArea();

        String text1 = "hello";
        String text2 = "world";

        ediortPage.setTextArea(text1);
        ediortPage.DecreaseIndention();
        ediortPage.setTextArea(text2);

        assertEquals(ediortPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");

    }
}
