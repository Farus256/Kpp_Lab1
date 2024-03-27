package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kpp_lab1.RationalFraction;
import kpp_lab1.Line;
public class RationalFractionTest {
    @Test
    public void testRationalFraction() {
        RationalFraction fraction = new RationalFraction(1, 2);
        // Проверяем, что дробь была создана
        assertNotNull(fraction);
        // Проверяем, что числитель и знаменатель установлены правильно
        assertEquals(1, fraction.getM());
        assertEquals(2, fraction.getN());
        // Проверяем, что дробь корректно преобразуется в строку
        assertEquals("1/2", fraction.toString());
        // Проверяем, что дробь корректно сокращается
        fraction = new RationalFraction(2, 4);
        fraction.reduce();
        assertEquals(1, fraction.getM());
        assertEquals(2, fraction.getN());
    }
}
