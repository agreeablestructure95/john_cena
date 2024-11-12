package vit.adda.johncena.paint.paintapplication;

public abstract class Shape {
    public abstract void draw();

    public abstract void erase();

    public void move() {
        System.out.println("Shape moved.");
    }

    public void resize() {
        System.out.println("Shape resized.");
    }
}
