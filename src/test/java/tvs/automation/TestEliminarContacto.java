/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

import java.util.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jalvez
 */
public class TestEliminarContacto {

    private String lastname;
    private Properties p;

    @Before
    public void init() {
        p = PropertyFile.getWebElementsProperties();
        System.setProperty("webdriver.chrome.driver",
                p.getProperty("driver.url"));
        // genero contacto a eliminar (reutilizo partes de Agregar Contacto)
        // pero con properties nuevo
        p = PropertyFile.getProperties("test02");
        lastname = java.util.UUID.randomUUID().toString().substring(20);
        Autenticacion.autenticarse(p);
        Funcionalidad.nuevoContacto(lastname, p);
    }

    @Test
    public void TestEliminar() {
        p = PropertyFile.getProperties("test02");
        Funcionalidad.eliminarContacto(lastname);
        try {
            Funcionalidad.buscarContacto(lastname);
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            // si no encuentra el elemento en la grilla, el test pasa
            assert true;
        }
    }

    @After
    public void tearDown() {
        Autenticacion.salir();
    }

}
