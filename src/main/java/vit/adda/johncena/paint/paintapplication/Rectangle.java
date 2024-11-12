package vit.adda.johncena.paint.paintapplication;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the rectangle.");
    }
}
