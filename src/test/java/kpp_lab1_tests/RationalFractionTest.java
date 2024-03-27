package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kpp_lab1.RationalFraction;

public class RationalFractionTest {
    @Test
    public void testModifyEvenIndexedElements() {
        RationalFraction[] fractions = {new RationalFraction(1, 2),
                new RationalFraction(3, 4), new RationalFraction(5, 6),
                new RationalFraction(7, 8), new RationalFraction(9, 10)};
        RationalFraction.modifyEvenIndexedElements(fractions);
        assertEquals("5/4", fractions[0].toString());
        assertEquals("3/4", fractions[1].toString());
        assertEquals("41/24", fractions[2].toString());
        assertEquals("7/8", fractions[3].toString());
        assertEquals("9/10", fractions[4].toString());
    }
}


