/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vit.adda.johncena.paint.paintapplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {
    @Test
    public void testArea() {
        Circle circle = new Circle();
        circle.setRadius(5); // Setting the radius for calculation
        assertEquals(78.5, circle.area(5), 0.1);
    }

    @Test
    public void testDraw() {
        Circle circle = new Circle();
        circle.draw();
    }

    @Test
    public void testMove() {
        Circle circle = new Circle();
        circle.move(); // Ensure no arguments are passed
    }

    @Test
    public void testErase() {
        Circle circle = new Circle();
        circle.erase();
    }
}
