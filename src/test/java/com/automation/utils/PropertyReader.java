package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.load(new FileReader("src//test//resources//config//config.properties"));

    }
}
