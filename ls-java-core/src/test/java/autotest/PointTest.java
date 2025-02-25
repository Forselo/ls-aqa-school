package autotest;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.core.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void testDistance() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        double expectedDistance = Math.sqrt(((4 - 1) * (4 - 1)) + ((6 - 2) * (6 - 2)));
        assertEquals(expectedDistance, p1.distance(p2), 0.001);
    }

    @Test
    public void testDistanceSamePoint() {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(3, 3);

        assertEquals(0, p1.distance(p2), 0.001);
    }
}
