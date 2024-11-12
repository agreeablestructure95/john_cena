package vit.adda.johncena.paint.paintapplication;

public class DialogBox extends Window {
    private boolean displayed = true;

    public void displayDialog() {
        displayed = true;
        System.out.println("Displaying dialog box.");
    }

    public boolean isDisplayed() {
        return displayed;
    }

    public void closeDialog() {
        displayed = false;
        System.out.println("Dialog box closed.");
    }
}
