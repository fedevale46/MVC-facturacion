package modelo;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Factura;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface FacturaModel {
    //Enlaces con el controlador
    FacturaController getController();
    void setController(FacturaController controller);

    //Funciones que debe permitir el modelo
    void nuevaFactura(Factura factura);
    Factura obtenerFactura(String nombre);
    void eliminarFactura(Factura factura);
    void actualizarFactura(Factura factura);
    List<Factura> obtenerFacturas();  
    List<Factura> listarPorCliente(String nombre);    
}
