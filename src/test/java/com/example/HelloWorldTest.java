package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testGreet() {
        assertEquals("Hello, Travis CI with Maven!", HelloWorld.greet());
    }
}
