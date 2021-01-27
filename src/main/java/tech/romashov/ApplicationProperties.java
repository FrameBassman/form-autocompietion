package tech.romashov;

import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ApplicationProperties {
    private FileSystem fs;
    private Logger log;
    private Properties origin;

    public ApplicationProperties(Logger logger, FileSystem fileSystem) {
        origin = new Properties();
        fs = fileSystem;
        log = logger;
        log.info("Start read properties");
        try {
            loadProps();
        } catch (IOException e) {
            log.error("Cannot read properties: ", e);
        }
        log.info("Finish read properties");
    }

    public String getProperty(String key) {
        return origin.getProperty(key);
    }

    private void loadProps() throws IOException {
        try {
            String fileName = "application.txt";
            log.info("Start to resolve path");
            Path external = fs.getPath(fileName);
            log.info("Finish path resolving");

            if (Files.exists(external)) {
                log.info("Start read properties from external file");
                try (InputStream input = Files.newInputStream(external)) {
                    log.info("Open external file as a stream");
                    try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
                        log.info("Open reader stream");
                        origin.load(reader);
                    }
                }
            } else {
                log.info("Start read properties from resources");
                try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
                    try (InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8)) {
                        origin.load(reader);
                    }
                }
            }
        } finally {
            log.info("Finish reading properties");
        }
    }
}
