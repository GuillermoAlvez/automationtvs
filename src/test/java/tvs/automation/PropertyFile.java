/*
 * To change this license header, choose License Headers in Project PropertyFile.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author jalvez
 */
class PropertyFile {

    static Properties getProperties(String file) {
        try (InputStream input = new FileInputStream("src/main/resources/" + file + ".properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // propiedades de los elementos web 
    static Properties getWebElementsProperties() {
        try (InputStream input = new FileInputStream("src/main/resources/webelements.properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
