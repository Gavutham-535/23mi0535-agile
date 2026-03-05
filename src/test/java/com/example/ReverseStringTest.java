package com.exmaple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public static void testReverse() {
        ReverseString rs = new ReverseString();
        assertEquals("olleh", rs.reverse("hello"));
        assertEquals("321", rs.reverse("123"));
        assertEquals("", rs.reverse(""));
    }
}
