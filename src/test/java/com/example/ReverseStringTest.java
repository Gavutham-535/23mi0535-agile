package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testReverse() {
        ReverseString rs = new ReverseString();
        assertEquals("olleh", rs.reverse("hello"));
    }
}
