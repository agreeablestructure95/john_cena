package vit.adda.johncena.paint.paintapplication;

public class PaintApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Paint Application");

        Frame frame = new Frame();
        frame.show();

        Window window = new Window();
        window.open();
        window.display();

        Shape circle = new Circle();
        circle.draw();
        circle.move();

        Point point = new Point(10, 20);
        point.display();
    }
}
