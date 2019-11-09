/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author jalvez
 */
public class Autenticacion {

    public static void autenticarse(Properties p) {
        //instancio propiedades que contienen las propiedades de los elementos
        Properties pWeb = TestProperties.getWebElementsProperties();
        // instancio driver
        WebDriver driver = Driver.getInstance();
        String url = p.getProperty("autenticarse.url");
        driver.get(url);
        // username
        String username_xpath = pWeb.getProperty("autenticarse.username_xpath");
        WebElement username_input = driver.findElement(By.xpath(username_xpath));
        username_input.sendKeys(p.getProperty("autenticarse.username_input.sendKeys"));
        // password
        String password_xpath = pWeb.getProperty("autenticarse.password_xpath");
        WebElement password_input = driver.findElement(By.xpath(password_xpath));
        password_input.sendKeys(p.getProperty("autenticarse.password_input.sendKeys"));
        // click login
        String login_button_xpath = pWeb.getProperty("autenticarse.login_button_xpath");
        WebElement loggin_button = driver.findElement(By.xpath(login_button_xpath));
        loggin_button.click();
    }

    public static void salir() {
        //instancio propiedades que contienen las propiedades de los elementos
        Properties pWeb = TestProperties.getWebElementsProperties();
        // instancio driver
        WebDriver driver = Driver.getInstance();
        String logout_button_xpath = pWeb.getProperty("salir.logout_xpath");
        WebElement logout_button = driver.findElement(By.xpath(logout_button_xpath));
        logout_button.click();
        Driver.close();
    }

}
