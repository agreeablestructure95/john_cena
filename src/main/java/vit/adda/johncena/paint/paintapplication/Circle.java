package vit.adda.johncena.paint.paintapplication;

public class Circle extends Shape {
    private float radius;
    private int center;

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle.");
    }
}
