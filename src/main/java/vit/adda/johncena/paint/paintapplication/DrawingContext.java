package vit.adda.johncena.paint.paintapplication;

public class DrawingContext {
    public void setOrigin(int x, int y) {
        System.out.println("Setting origin to (" + x + ", " + y + ")");
    }

    public int getVerticalSize() {
        return 500;
    }

    public int getHorizontalSize() {
        return 800;
    }
}
