package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoAppTest {

    @Test
    public void testStartupMessage() {
        assertEquals(
            "Demo App Started Successfully",
            DemoApp.getStartupMessage()
        );
    }
}
