import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    void shouldConstructIfSidesPositive() {
        try {
            new Rectangle(5, 6);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotConstructIfSidesNotPositive() {
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
    void shouldComputeAreaCorrect() {
        List<Integer> side1 = Arrays.asList(1, 5, 12, 10);
        List<Integer> side2 = Arrays.asList(2, 8, 11, 10);
        List<Integer> area = Arrays.asList(2, 40, 132, 100);
        for (int i = 0; i < 4; i++) {
            try {
                Rectangle rect = new Rectangle(side1.get(i), side2.get(i));
                assertEquals(rect.calculateArea(), area.get(i));
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
    }
}
