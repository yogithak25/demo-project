package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoApp {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DemoApp.class);

    public static final String STARTUP_MESSAGE =
            "Demo App Started Successfully";

    public static void main(String[] args) {
        LOGGER.info(STARTUP_MESSAGE);
    }
}
