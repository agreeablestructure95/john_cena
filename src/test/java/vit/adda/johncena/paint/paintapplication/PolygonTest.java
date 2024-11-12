/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vit.adda.johncena.paint.paintapplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class PolygonTest {
    @Test
    public void testDraw() {
        Polygon polygon = new Polygon();
        polygon.draw();
    }

    @Test
    public void testMove() {
        Polygon polygon = new Polygon();
        polygon.move();
    }

    @Test
    public void testErase() {
        Polygon polygon = new Polygon();
        polygon.erase();
    }
}
