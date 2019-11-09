/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author jalvez
 */
class Funcionalidad {

    static void nuevoContacto(String lastname, Properties p) {
        //instancio propiedades que contienen las propiedades de los elementos
        Properties pWeb = PropertyFile.getWebElementsProperties();
        // instancio driver
        WebDriver driver = Driver.getInstance();
        // ingreso a url
        driver.get(p.getProperty("nuevoContacto.url"));
        //name
        String name_xpath = pWeb.getProperty("nuevoContacto.name_xpath");
        WebElement name_input = driver.findElement(By.xpath(name_xpath));
        name_input.click();
        //prefix
        String prefix_xpath = pWeb.getProperty("nuevoContacto.prefix_xpath");
        WebElement prefix_input = driver.findElement(By.xpath(prefix_xpath));
        prefix_input.sendKeys(p.getProperty("nuevoContacto.prefix_input"));
        //firstname
        String firstname_xpath = pWeb.getProperty("nuevoContacto.firstname_xpath");
        WebElement firstname_input = driver.findElement(By.xpath(firstname_xpath));
        firstname_input.sendKeys(p.getProperty("nuevoContacto.firstname_input"));
        //middlename
        String middlename_xpath = pWeb.getProperty("nuevoContacto.middlename_xpath");
        WebElement middlename_input = driver.findElement(By.xpath(middlename_xpath));
        middlename_input.sendKeys(p.getProperty("nuevoContacto.middlename_input"));
        //lastname
        String lastname_xpath = pWeb.getProperty("nuevoContacto.lastname_xpath");
        WebElement lastname_input = driver.findElement(By.xpath(lastname_xpath));
        lastname_input.sendKeys(lastname);
        //suffix
        String suffix_xpath = pWeb.getProperty("nuevoContacto.suffix_xpath");
        WebElement suffix_input = driver.findElement(By.xpath(suffix_xpath));
        suffix_input.sendKeys(p.getProperty("nuevoContacto.suffix_input"));
        //ok button
        String okbutton_xpath = pWeb.getProperty("nuevoContacto.okbutton_xpath");
        WebElement ok_button = driver.findElement(By.xpath(okbutton_xpath));
        ok_button.click();
        //title
        String title_xpath = pWeb.getProperty("nuevoContacto.title_xpath");
        WebElement title_input = driver.findElement(By.xpath(title_xpath));
        title_input.sendKeys(p.getProperty("nuevoContacto.title_input"));
        //role
        String role_xpath = pWeb.getProperty("nuevoContacto.role_xpath");
        WebElement role_input = driver.findElement(By.xpath(role_xpath));
        role_input.sendKeys(p.getProperty("nuevoContacto.role_input"));
        //room
        String room_xpath = pWeb.getProperty("nuevoContacto.room_xpath");
        WebElement room_input = driver.findElement(By.xpath(room_xpath));
        room_input.sendKeys(p.getProperty("nuevoContacto.room_input"));
        //organization
        String organization_xpath = pWeb.getProperty("nuevoContacto.organization_xpath");
        WebElement organization_input = driver.findElement(By.xpath(organization_xpath));
        organization_input.sendKeys(p.getProperty("nuevoContacto.organization_input"));
        //department
        String department_xpath = pWeb.getProperty("nuevoContacto.department_xpath");
        WebElement department_input = driver.findElement(By.xpath(department_xpath));
        department_input.sendKeys(p.getProperty("nuevoContacto.department_input"));
        //street
        String street_xpath = pWeb.getProperty("nuevoContacto.street_xpath");
        WebElement street_input = driver.findElement(By.xpath(street_xpath));
        street_input.sendKeys(p.getProperty("nuevoContacto.street_input"));
        //citypostalcode
        String citypostalcode_xpath = pWeb.getProperty("nuevoContacto.citypostalcode_xpath");
        WebElement citypostalcode_input = driver.findElement(By.xpath(citypostalcode_xpath));
        citypostalcode_input.sendKeys(p.getProperty("nuevoContacto.citypostalcode_input"));
        //city name
        String cityname_xpath = pWeb.getProperty("nuevoContacto.cityname_xpath");
        WebElement cityname_input = driver.findElement(By.xpath(cityname_xpath));
        cityname_input.sendKeys(p.getProperty("nuevoContacto.cityname_input"));
        //
        String countryselect_xpath = pWeb.getProperty("nuevoContacto.countryselect_xpath");
        WebElement coutry_input = driver.findElement(By.xpath(countryselect_xpath));
        coutry_input.sendKeys(p.getProperty("nuevoContacto.country_input"));
        // phone number
        String businessphone_xpath = pWeb.getProperty("nuevoContacto.businessphone_xpath");
        WebElement businessphone_input = driver.findElement(By.xpath(businessphone_xpath));
        businessphone_input.sendKeys(p.getProperty("nuevoContacto.bussinessphone_input"));
        //mobilephone
        String mobilephone_xpath = pWeb.getProperty("nuevoContacto.mobilephone_xpath");
        WebElement mobilephone_input = driver.findElement(By.xpath(mobilephone_xpath));
        mobilephone_input.sendKeys(p.getProperty("nuevoContacto.mobilephone_input"));
        //private phone
        String privatephone_xpath = pWeb.getProperty("nuevoContacto.privatephone_xpath");
        WebElement privatephone_input = driver.findElement(By.xpath(privatephone_xpath));
        privatephone_input.sendKeys(p.getProperty("nuevoContacto.privatesphone_input"));
        // email & internet
        String url_xpath = pWeb.getProperty("nuevoContacto.url_xpath");
        WebElement url_input = driver.findElement(By.xpath(url_xpath));
        url_input.sendKeys(p.getProperty("nuevoContacto.url_input"));
        //email
        String email_xpath = pWeb.getProperty("nuevoContacto.email_xpath");
        WebElement email_input = driver.findElement(By.xpath(email_xpath));
        email_input.sendKeys(p.getProperty("nuevoContacto.email_input"));
        //private email
        String privateemail_xpath = pWeb.getProperty("nuevoContacto.privateemail_xpath");
        WebElement privateemail_input = driver.findElement(By.xpath(privateemail_xpath));
        privateemail_input.sendKeys(p.getProperty("nuevoContacto.privateeemail_input"));
        //click en save
        String save_xpath = pWeb.getProperty("nuevoContacto.save_xpath");
        WebElement save_button = driver.findElement(By.xpath(save_xpath));
        save_button.click();
    }

    static void eliminarContacto(String lastname) {
        //instancio propiedades que contienen las propiedades de los elementos
        Properties pWeb = PropertyFile.getWebElementsProperties();
        // instancio driver
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/etemplate/process_exec.php?menuaction=addressbook.uicontacts.index");
        String search_xpath = pWeb.getProperty("eliminarContacto.search_xpath");
        WebElement search_input = driver.findElement(By.xpath(search_xpath));
        //elimino contenido del input y luego escribo la busqueda
        search_input.sendKeys(Keys.CONTROL + "a");
        search_input.sendKeys(Keys.DELETE);
        search_input.sendKeys(lastname);
        String searchbutton_xpath = pWeb.getProperty("buscarContacto.searchbutton_xpath");
        WebElement search_button = driver.findElement(By.xpath(searchbutton_xpath));
        search_button.click();
        //click en primer resultado
        String deletebutton_xpath = pWeb.getProperty("eliminarContacto.deletebutton_xpath");
        WebElement delete_button = driver.findElement(By.xpath(deletebutton_xpath));
        delete_button.click();
        //aceptar delete
        driver.switchTo().alert().accept();
    }

    static void buscarContacto(String lastname) {
        Properties pWeb = PropertyFile.getWebElementsProperties();
        // instancio driver
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/etemplate/process_exec.php?menuaction=addressbook.uicontacts.index");
        String search_xpath = pWeb.getProperty("buscarContacto.search_xpath");
        WebElement search_input = driver.findElement(By.xpath(search_xpath));
        //elimino contenido del input y luego escribo la busqueda
        search_input.sendKeys(Keys.CONTROL + "a");
        search_input.sendKeys(Keys.DELETE);
        search_input.sendKeys(lastname);
        String searchbutton_xpath = pWeb.getProperty("buscarContacto.searchbutton_xpath");
        WebElement search_button = driver.findElement(By.xpath(searchbutton_xpath));
        search_button.click();
        //click en primer resultado
        String lupabutton_xpath = pWeb.getProperty("buscarContacto.lupabutton_xpath");
        WebElement lupa_button = driver.findElement(By.xpath(lupabutton_xpath));
        lupa_button.click();
    }

}
