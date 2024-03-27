package kpp_lab1_tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import kpp_lab1.StringChild;
public class StringChildTest {
    @Test
    public void testStringChild() {
        assertEquals("ry", StringChild.longestCommonChild("harry", "robby"));
        assertEquals("error", StringChild.longestCommonChild("xx", "zz"));
        assertEquals("abcdef", StringChild.longestCommonChild("abcdef", "abcdef"));
    }
}
