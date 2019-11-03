/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvs.automation;

/**
 *
 * @author jalvez
 */
public class Pruebas {

    static void test01_AgregarContacto() {
        String lastname = java.util.UUID.randomUUID().toString().substring(20);
        Autenticacion.autenticarse();
        Funcionalidad.nuevoContacto(lastname);
        Validaciones.contactoCreado(lastname);
        //limpio contexto
        Funcionalidad.eliminarContacto(lastname);
    }

    static void test02_EliminarContacto() {
    }

}
