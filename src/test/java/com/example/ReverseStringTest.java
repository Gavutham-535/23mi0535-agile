package com.exmaple;

public class ReverseStringTest {
    @Test
    public static void testReverse() {
        ReverseString rs = new ReverseString();
        assertEquals("olleh", rs.reverse("hello"));
        assertEquals("321", rs.reverse("123"));
        assertEquals("", rs.reverse(""));
    }
}
