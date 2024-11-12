package vit.adda.johncena.paint.paintapplication;

public class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a polygon.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the polygon.");
    }
}
