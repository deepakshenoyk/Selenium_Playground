package org.deep.utilities;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    Properties property;

    public ConfigDataProvider() {
        File src = new File("./Config/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            property = new Properties();
            property.load(fis);
        } catch (Exception e) {
            System.out.println("Unable to load the Config file" + e.getMessage());
        }

    }

    public String getProperty(String propertyName) {
        return property.getProperty(propertyName);
    }
}
