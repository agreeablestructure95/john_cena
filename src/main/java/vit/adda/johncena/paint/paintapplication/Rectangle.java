package vit.adda.johncena.paint.paintapplication;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the rectangle.");
    }
}
