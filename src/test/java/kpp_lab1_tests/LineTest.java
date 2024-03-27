package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import kpp_lab1.Line;
import kpp_lab1.RationalFraction;

import static org.junit.jupiter.api.Assertions.*;
public class LineTest {
    @Test
    public void testLine() {
        RationalFraction slope = new RationalFraction(1, 2);
        RationalFraction intercept = new RationalFraction(3, 4);
        Line line = new Line(slope, intercept);
        // TODO: Add assertions to test the behavior of the Line class
    }
}
