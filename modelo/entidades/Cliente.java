package modelo.entidades;

import java.io.Serializable;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface Cliente extends Entidad {
    
    String getDNI();
    String getNombre();
    String getDireccion();
    
    void setDNI(String dni);
    void setNombre(String nombre);
    void setDireccion(String direccion);
}
