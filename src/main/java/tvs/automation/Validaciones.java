/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author jalvez
 */
public class Validaciones {

    static void contactoCreado(String lastname, Properties p) {
        Funcionalidad.buscarContacto(lastname);
//        Assert.assertEquals("asd", "asde");
        WebDriver driver = Driver.getInstance();
        Properties pWeb = TestProperties.getWebElementsProperties();
        //
        String real_name_xpath = pWeb.getProperty("validaciones.name_xpath");
        String real_name = driver.findElement(By.xpath(real_name_xpath)).getAttribute("value");
        String expected_name = p.getProperty("nuevoContacto.prefix_input") + " "
                + p.getProperty("nuevoContacto.firstname_input") + " "
                + p.getProperty("nuevoContacto.middlename_input") + " "
                + lastname + " "
                + p.getProperty("nuevoContacto.suffix_input");
        Assert.assertEquals(expected_name, real_name);
        //
        String real_title_xpath = pWeb.getProperty("validaciones.title_xpath");
        String real_title = driver.findElement(By.xpath(real_title_xpath)).getText();
        String expected_title = p.getProperty("nuevoContacto.title_input");
        Assert.assertEquals(expected_title, real_title);
        //
        String real_role_xpath = pWeb.getProperty("validaciones.role_xpath");
        String real_role = driver.findElement(By.xpath(real_role_xpath)).getText();
        String expected_role = p.getProperty("nuevoContacto.role_input");
        Assert.assertEquals(expected_role, real_role);
        //
        String real_organization_xpath = pWeb.getProperty("validaciones.organization_xpath");
        String real_organization = driver.findElement(By.xpath(real_organization_xpath)).getText();
        String expected_organization = p.getProperty("nuevoContacto.organization_input");
        Assert.assertEquals(expected_organization, real_organization);
        //
        String real_department_xpath = pWeb.getProperty("validaciones.department_xpath");
        String real_department = driver.findElement(By.xpath(real_department_xpath)).getText();
        String expected_department = p.getProperty("nuevoContacto.department_input");
        Assert.assertEquals(expected_department, real_department);
        //
        String real_street_xpath = pWeb.getProperty("validaciones.street_xpath");
        String real_street = driver.findElement(By.xpath(real_street_xpath)).getText();
        String expected_street = p.getProperty("nuevoContacto.street_input");
        Assert.assertEquals(expected_street, real_street);
        //
        String real_city_xpath = pWeb.getProperty("validaciones.city_xpath");
        String real_city = driver.findElement(By.xpath(real_city_xpath)).getText();
        String expected_city = p.getProperty("nuevoContacto.citypostalcode_input") + " "
                + p.getProperty("nuevoContacto.cityname_input");
        Assert.assertEquals(expected_city, real_city);
        //
        String real_businessphone_xpath = pWeb.getProperty("validaciones.real_businessphone_xpath");
        String real_businessphone = driver.findElement(By.xpath(real_businessphone_xpath)).getText();
        String expected_businessphone = p.getProperty("nuevoContacto.bussinessphone_input");
        Assert.assertEquals(expected_businessphone, real_businessphone);
        //
        String real_mobilephone_xpath = pWeb.getProperty("validaciones.real_mobilephone_xpath");
        String real_mobilephone = driver.findElement(By.xpath(real_mobilephone_xpath)).getText();
        String expected_mobilephone = p.getProperty("nuevoContacto.mobilephone_input");
        Assert.assertEquals(expected_mobilephone, real_mobilephone);
        //
        String real_privatephone_xpath = pWeb.getProperty("validaciones.real_privatephone_xpath");
        String real_privatephone = driver.findElement(By.xpath(real_privatephone_xpath)).getText();
        String expected_privatephone = p.getProperty("nuevoContacto.privatesphone_input");
        Assert.assertEquals(expected_privatephone, real_privatephone);
        //
        String real_url_xpath = pWeb.getProperty("validaciones.real_url_xpath");
        String real_url = driver.findElement(By.xpath(real_url_xpath)).getText();
        String expected_url = p.getProperty("nuevoContacto.url_input");
        Assert.assertEquals(expected_url, real_url);
        //
        String real_email_xpath = pWeb.getProperty("validaciones.real_email_xpath");
        String real_email = driver.findElement(By.xpath(real_email_xpath)).getText();
        String expected_email = p.getProperty("nuevoContacto.email_input");
        Assert.assertEquals(expected_email, real_email);
        //
        String real_privatemail_xpath = pWeb.getProperty("validaciones.real_privatemail_xpath");
        String real_privatemail = driver.findElement(By.xpath(real_privatemail_xpath)).getText();
        String expected_privatemail = p.getProperty("nuevoContacto.privateeemail_input");
        Assert.assertEquals(expected_privatemail, real_privatemail);
    }

}
