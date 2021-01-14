package tech.romashov;

import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ApplicationProperties {
    private Properties origin;

    public ApplicationProperties(Logger logger) {
        origin = new Properties();
        logger.info("Start read properties");
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.txt")) {
            try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
                origin.load(reader);
            }
        } catch (IOException e) {
            logger.error("Cannot read properties: ", e);
        }
        logger.info("Finish read properties");
    }

    public String getProperty(String key) {
        return origin.getProperty(key);
    }
}
