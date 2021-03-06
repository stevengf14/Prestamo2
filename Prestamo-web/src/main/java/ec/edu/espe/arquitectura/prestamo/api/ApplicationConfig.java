/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.prestamo.api;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Steven
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ec.edu.espe.arquitectura.prestamo.api.ComisionResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.CuotaAmortizacionResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.NuevoPrestamoResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.PagoResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.TipoProductoResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.UsuarioResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.VerAmortizacionResource.class);
        resources.add(ec.edu.espe.arquitectura.prestamo.api.VerPrestamoResource.class);
    }
    
}
