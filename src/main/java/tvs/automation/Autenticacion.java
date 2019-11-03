/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author jalvez
 */
public class Autenticacion {

    public static void autenticarse() {
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/index.php?menuaction=addressbook.uicontacts.edit");
        //
        String username_xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input";
        WebElement username_input = driver.findElement(By.xpath(username_xpath));
        username_input.sendKeys("grupo1");
        //
        String password_xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input";
        WebElement password_input = driver.findElement(By.xpath(password_xpath));
        password_input.sendKeys("grupo1");
        //
        String login_button_xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input";
        WebElement loggin_button = driver.findElement(By.xpath(login_button_xpath));
        loggin_button.click();
    }

    public static void salir() {
    }

}
