/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vit.adda.johncena.paint.paintapplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class WindowTest {
    @Test
    public void testOpen() {
        Window window = new Window();
        window.open();
        assertTrue(window.isOpen());
    }

    @Test
    public void testClose() {
        Window window = new Window();
        window.open(); // First open to close it
        window.close();
        assertFalse(window.isOpen());
    }

    @Test
    public void testDisplay() {
        Window window = new Window();
        window.display();
    }

    @Test
    public void testMove() {
        Window window = new Window();
        window.move();
    }

    @Test
    public void testHandleEvent() {
        Window window = new Window();
        window.handleEvent();
    }
}
