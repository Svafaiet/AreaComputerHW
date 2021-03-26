import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void shouldConstructIfSidesPositive() {
        try {
            new Rectangle(5, 6);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldNotConstructIfSidesNotPositive() {
        List<Integer> side1 = Arrays.asList(0, -1, 1, 1);
        List<Integer> side2 = Arrays.asList(2, 2, -1, 0);
        for (int i = 0; i < 4; i++) {
            try {
                new Rectangle(side1.get(i), side2.get(i));
            } catch (Exception e) {
                assertEquals(e.getMessage(), "Sides must be positive");
            }
        }
    }

    @Test
    public void shouldComputeAreaCorrect() {
        List<Integer> side1 = Arrays.asList(1, 5, 12, 10);
        List<Integer> side2 = Arrays.asList(2, 8, 11, 10);
        List<Integer> area = Arrays.asList(2, 40, 132, 100);
        for (int i = 0; i < 4; i++) {
            try {
                Rectangle rect = new Rectangle(side1.get(i), side2.get(i));
                assertEquals(rect.computeArea(), (long) area.get(i));
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
    }

    @Test
    public void shouldGetCorrect() {
        try {
            Rectangle rect = new Rectangle(1, 3);
            assertEquals(rect.getWidth(), 1);
            assertEquals(rect.getHeight(), 3);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldChangeGetOnSet() {
        try {
            Rectangle rect = new Rectangle(4, 7);
            rect.setWidth(1);
            rect.setHeight(3);
            assertEquals(rect.getWidth(), 1);
            assertEquals(rect.getHeight(), 3);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldChangeComputeAreaOnSetCorrect() {
        List<Integer> side1 = Arrays.asList(1, 5, 12, 10);
        List<Integer> side2 = Arrays.asList(2, 8, 11, 10);
        List<Integer> area = Arrays.asList(2, 40, 132, 100);
        for (int i = 0; i < 4; i++) {
            try {
                Rectangle rect = new Rectangle(1, 3);
                rect.setWidth(side1.get(i));
                rect.setHeight(side2.get(i));
                assertEquals(rect.computeArea(), (long) area.get(i));
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
    }
}
