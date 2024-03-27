package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kpp_lab1.RationalFraction;
import kpp_lab1.Line;

public class LineTest {
    @Test
    public void testGetIntersections() {
        Line line = new Line(new RationalFraction(1, 2), new RationalFraction(3, 4));
        RationalFraction[] intersections = line.getIntersections();
        assertEquals("-3/2", intersections[0].toString());
        assertEquals("3/4", intersections[1].toString());
    }

    @Test
    public void testGetIntersection() {
        Line line1 = new Line(new RationalFraction(1, 2), new RationalFraction(3, 4));
        Line line2 = new Line(new RationalFraction(2, 3), new RationalFraction(4, 5));
        RationalFraction intersection = line1.getIntersection(line2);
        assertEquals("-1/1", intersection.toString());
    }

    @Test
    public void testAreParallel() {
        Line line1 = new Line(new RationalFraction(1, 2), new RationalFraction(3, 4));
        Line line2 = new Line(new RationalFraction(2, 4), new RationalFraction(4, 5));
        assertTrue(Line.areParallel(line1, line2));
    }
}
