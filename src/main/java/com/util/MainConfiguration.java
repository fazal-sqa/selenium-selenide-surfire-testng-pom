package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class MainConfiguration {
    Properties prop;
    FileInputStream ip;
    public  MainConfiguration ()   {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config.properties");
            prop.load(ip);
        } catch (Exception ex ) {
            ex.printStackTrace();
        }
    }
    public String getResponse(String valResponse)
    {
        return prop.getProperty(valResponse);
    }
}
