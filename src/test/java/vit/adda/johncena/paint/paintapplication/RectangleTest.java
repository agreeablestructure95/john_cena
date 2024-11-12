package vit.adda.johncena.paint.paintapplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10); // Setting the length for calculation
        rectangle.setWidth(5);   // Setting the width for calculation
        assertEquals(50, rectangle.area(10, 5), 0.1);
    }

    @Test
    public void testDraw() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }

    @Test
    public void testMove() {
        Rectangle rectangle = new Rectangle();
        rectangle.move(); // Ensure no arguments are passed
    }

    @Test
    public void testErase() {
        Rectangle rectangle = new Rectangle();
        rectangle.erase();
    }
}
