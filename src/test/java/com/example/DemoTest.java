package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testStartupMessage() {
        String msg = DemoApp.getStartupMessage();
        assertEquals("Demo App Started Successfully", msg);
    }
}
