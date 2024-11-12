package vit.adda.johncena.paint.paintapplication;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point at (" + x + ", " + y + ")");
    }
}
