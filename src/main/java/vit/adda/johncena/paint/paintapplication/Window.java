package vit.adda.johncena.paint.paintapplication;

public class Window extends Frame {
    public void open() {
        System.out.println("Window opened.");
    }

    public void close() {
        System.out.println("Window closed.");
    }

    public void move() {
        System.out.println("Window moved.");
    }

    public void display() {
        System.out.println("Displaying window.");
    }

    public void handleEvent() {
        System.out.println("Event handled in window.");
    }
}
