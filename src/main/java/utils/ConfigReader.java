package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    // Constructor to load the properties file
    public ConfigReader() {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to load config.properties file.");
        }
    }

    // Method to get a property value by key
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
