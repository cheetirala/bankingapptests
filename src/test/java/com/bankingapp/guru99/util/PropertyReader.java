package com.bankingapp.guru99.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by kotche on 23/09/2016.
 */
public class PropertyReader {
    Properties properties = new Properties();
    InputStream inputStream = null;

    public PropertyReader(){
        loadProperties();
    }

    private void loadProperties() {
        try {
            inputStream = new FileInputStream("src/test/resources/config/si1.properties");
            properties.load(inputStream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key){
        return properties.getProperty(key);
    }
}
