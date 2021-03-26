import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void shouldConstructIfSidePositive() {
        try {
            new Square(5);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldNotConstructIfSidesNotPositive() {
        List<Integer> sides = Arrays.asList(0, -1, -2);
        for (int i = 0; i < 3; i++) {
            try {
                new Square(sides.get(i));
            } catch (Exception e) {
                assertEquals(e.getMessage(), "Sides must be positive");
            }
        }
    }

    @Test
    public void shouldComputeAreaCorrect() {
        List<Integer> sides = Arrays.asList(1, 5, 12, 10);
        List<Integer> area = Arrays.asList(1, 25, 144, 100);
        for (int i = 0; i < 4; i++) {
            try {
                Square sq = new Square(sides.get(i));
                assertEquals(sq.computeArea(), (long) area.get(i));
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
    }

    @Test
    public void shouldGetCorrect() {
        try {
            Square sq = new Square(3);
            assertEquals(sq.getSide(), 3);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldChangeGetOnSet() {
        try {
            Square sq = new Square(4);
            sq.setSide(5);
            assertEquals(sq.getSide(), 5);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void shouldSetNegativeFail() {
        Rectangle rect = new Rectangle(1, 3);
        try {
            rect.setWidth(-1);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Sides must be positive");
        }
        try {
            rect.setHeight(-1);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Sides must be positive");
        }
    }

    @Test
    public void shouldChangeComputeAreaOnSetCorrect() {
        List<Integer> sides = Arrays.asList(1, 5, 12, 10);
        List<Integer> area = Arrays.asList(1, 25, 144, 100);
        Square sq;
        for (int i = 0; i < 4; i++) {
            try {
                sq = new Square(sides.get(i));
                assertEquals(sq.computeArea(), (long) area.get(i));
            } catch (Exception e) {
                fail(e.getMessage());
            }
        }
    }
}
