package modelo.persistencia;

import java.io.Serializable;
import java.util.List;
import modelo.entidades.Factura;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public interface FacturaDAO extends GenericDAO<Factura, String>{
    Factura read(String pk);
    void create(Factura factura);
    void update(Factura factura);
    void delete(Factura factura);
    List <Factura> list();
    List<Factura> listByCliente(String dni);    
}
