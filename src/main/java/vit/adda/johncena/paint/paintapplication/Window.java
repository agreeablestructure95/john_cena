package vit.adda.johncena.paint.paintapplication;

public class Window extends Frame {
    private boolean isOpen = false;

    public void open() {
        isOpen = true;
        System.out.println("Window opened.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Window closed.");
    }

    public boolean isOpen() {
        return isOpen;
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
