/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author jalvez
 */
class Funcionalidad {

    static void nuevoContacto(String lastname) {
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/index.php?menuaction=addressbook.uicontacts.edit");
        String name_xpath = "//*[@id=\"exec[n_fn]\"]";
        WebElement name_input = driver.findElement(By.xpath(name_xpath));
        name_input.click();
        String prefix_xpath = "//*[@id=\"exec[n_prefix]\"]";
        WebElement prefix_input = driver.findElement(By.xpath(prefix_xpath));
        prefix_input.sendKeys("prefix");
        String firstname_xpath = "//*[@id=\"exec[n_given]\"]";
        WebElement firstname_input = driver.findElement(By.xpath(firstname_xpath));
        firstname_input.sendKeys("firstname");
        String middlename_xpath = "//*[@id=\"exec[n_middle]\"]";
        WebElement middlename_input = driver.findElement(By.xpath(middlename_xpath));
        middlename_input.sendKeys("middlename");
        String lastname_xpath = "//*[@id=\"exec[n_family]\"]";
        WebElement lastname_input = driver.findElement(By.xpath(lastname_xpath));
        lastname_input.sendKeys(lastname);
        String suffix_xpath = "//*[@id=\"exec[n_suffix]\"]";
        WebElement suffix_input = driver.findElement(By.xpath(suffix_xpath));
        suffix_input.sendKeys("suffix");
        String okbutton_xpath = "/html/body/div[1]/form/div/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td/div[1]/table/tbody/tr[1]/td[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[2]/input";
        WebElement ok_button = driver.findElement(By.xpath(okbutton_xpath));
        ok_button.click();
        //  title
        String title_xpath = "//*[@id=\"exec[title]\"]";
        WebElement title_input = driver.findElement(By.xpath(title_xpath));
        title_input.sendKeys("title");
        String role_xpath = "//*[@id=\"exec[role]\"]";
        WebElement role_input = driver.findElement(By.xpath(role_xpath));
        role_input.sendKeys("role");
        String room_xpath = "//*[@id=\"exec[room]\"]";
        WebElement room_input = driver.findElement(By.xpath(room_xpath));
        room_input.sendKeys("room");
        String organization_xpath = "//*[@id=\"exec[org_name]\"]";
        WebElement organization_input = driver.findElement(By.xpath(organization_xpath));
        organization_input.sendKeys("organization");
        String department_xpath = "//*[@id=\"exec[org_unit]\"]";
        WebElement department_input = driver.findElement(By.xpath(department_xpath));
        department_input.sendKeys("department");
        String street_xpath = "//*[@id=\"exec[adr_one_street]\"]";
        WebElement street_input = driver.findElement(By.xpath(street_xpath));
        street_input.sendKeys("street");
        String citypostalcode_xpath = "//*[@id=\"exec[adr_one_postalcode]\"]";
        WebElement citypostalcode_input = driver.findElement(By.xpath(citypostalcode_xpath));
        citypostalcode_input.sendKeys("11700");
        String cityname_xpath = "//*[@id=\"exec[adr_one_locality]\"]";
        WebElement cityname_input = driver.findElement(By.xpath(cityname_xpath));
        cityname_input.sendKeys("CityName");
        String countryselect_xpath = "//*[@id=\"exec[adr_one_countryname]\"]";
        WebElement coutry_input = driver.findElement(By.xpath(countryselect_xpath));
        coutry_input.sendKeys("URUGUAY");
        // phone number
        String businessphone_xpath = "//*[@id=\"exec[tel_work]\"]";
        WebElement businessphone_input = driver.findElement(By.xpath(businessphone_xpath));
        businessphone_input.sendKeys("098123456");
        String mobilephone_xpath = "//*[@id=\"exec[tel_cell]\"]";
        WebElement mobilephone_input = driver.findElement(By.xpath(mobilephone_xpath));
        mobilephone_input.sendKeys("098223456");
        String privatephone_xpath = "//*[@id=\"exec[tel_home]\"]";
        WebElement privatephone_input = driver.findElement(By.xpath(privatephone_xpath));
        privatephone_input.sendKeys("098229956");
        // email & internet
        String url_xpath = "//*[@id=\"exec[url]\"]";
        WebElement url_input = driver.findElement(By.xpath(url_xpath));
        url_input.sendKeys("www.hola.com");
        String email_xpath = "//*[@id=\"exec[email]\"]";
        WebElement email_input = driver.findElement(By.xpath(email_xpath));
        email_input.sendKeys("mail@gmail.com");
        String privateemail_xpath = "//*[@id=\"exec[email_home]\"]";
        WebElement privateemail_input = driver.findElement(By.xpath(privateemail_xpath));
        privateemail_input.sendKeys("priv@gmail.com");
        //click en save
        String save_xpath = "//*[@id=\"exec[button][save]\"]";
        WebElement save_button = driver.findElement(By.xpath(save_xpath));
        save_button.click();
    }

    static void eliminarContacto(String lastname) {
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/etemplate/process_exec.php?menuaction=addressbook.uicontacts.index");
        String search_xpath = "/html/body/div[3]/div[4]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[6]/input";
        WebElement search_input = driver.findElement(By.xpath(search_xpath));
        //elimino contenido del input y luego escribo la busqueda
        search_input.sendKeys(Keys.CONTROL + "a");
        search_input.sendKeys(Keys.DELETE);
        search_input.sendKeys(lastname);
        String searchbutton_xpath = "//*[@id=\"exec[nm][start_search]\"]";
        WebElement search_button = driver.findElement(By.xpath(searchbutton_xpath));
        search_button.click();
        //click en primer resultado
        String deletebutton_xpath = "/html/body/div[3]/div[4]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[6]/table/tbody/tr/td[4]/a/img";
        WebElement delete_button = driver.findElement(By.xpath(deletebutton_xpath));
        delete_button.click();
        //aceptar delete
        driver.switchTo().alert().accept();
    }

    static void buscarContacto(String lastname) {
        WebDriver driver = Driver.getInstance();
        driver.get("http://egroupware.cursos.ces.com.uy/egroupware/etemplate/process_exec.php?menuaction=addressbook.uicontacts.index");
        String search_xpath = "/html/body/div[3]/div[4]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[6]/input";
        WebElement search_input = driver.findElement(By.xpath(search_xpath));
        //elimino contenido del input y luego escribo la busqueda
        search_input.sendKeys(Keys.CONTROL + "a");
        search_input.sendKeys(Keys.DELETE);
        search_input.sendKeys(lastname);
        String searchbutton_xpath = "//*[@id=\"exec[nm][start_search]\"]";
        WebElement search_button = driver.findElement(By.xpath(searchbutton_xpath));
        search_button.click();
        //click en primer resultado
        String lupabutton_xpath = "/html/body/div[3]/div[4]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[6]/table/tbody/tr/td[2]/a/img";
        WebElement lupa_button = driver.findElement(By.xpath(lupabutton_xpath));
        lupa_button.click();
    }

}
