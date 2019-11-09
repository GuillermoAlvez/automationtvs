package tvs.automation;

import java.util.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAgregarContacto {

    private Properties p;
    private String lastname;

    @Before
    public void init() {
        Properties p = TestProperties.getWebElementsProperties();
        System.setProperty("webdriver.chrome.driver",
                p.getProperty("driver.url"));
    }

    @Test
    public void TestAgregar() {
        // leo properties del test
        p = TestProperties.getProperties("test01");
        //genero apellido random para buscar por apellido
        lastname = java.util.UUID.randomUUID().toString().substring(20);
        Autenticacion.autenticarse(p);
        Funcionalidad.nuevoContacto(lastname, p);
        //validaciones
        Validaciones.contactoCreado(lastname, p);
    }

    @After
    public void tearDown() {
        //limpio contexto: eliminar contacto creado
        Funcionalidad.eliminarContacto(lastname);
        Autenticacion.salir();
    }

}
