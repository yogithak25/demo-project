package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testStartupMessage() {
        assertEquals(
            "Demo App Started Successfully",
            DemoApp.STARTUP_MESSAGE
        );
    }
}
