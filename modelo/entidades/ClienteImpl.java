package modelo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class ClienteImpl implements Cliente {

    private String DNI;
    private String nombre;
    private String direccion;
       private List<Factura> facturas;

    public ClienteImpl(String DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
           this.facturas=new ArrayList();
    }

    public ClienteImpl(String DNI) {
        this(DNI,null,null);
    }

    
    @Override
    public String getDNI() {
        return DNI;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //return "ClienteImpl{" + "DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + '}';
        return nombre;
    }
    
}
