package vit.adda.johncena.paint.paintapplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class DialogBoxTest {
    @Test
    public void testDisplayDialog() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.displayDialog();
        assertTrue(dialogBox.isDisplayed());
    }

    @Test
    public void testCloseDialog() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.displayDialog();
        dialogBox.closeDialog();
        assertFalse(dialogBox.isDisplayed());
    }
}
