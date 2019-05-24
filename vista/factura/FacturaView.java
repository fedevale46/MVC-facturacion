package vista.factura;

import controlador.FacturaController;
import modelo.FacturaModel;


/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface FacturaView {
    FacturaModel getModel();
    void setModel(FacturaModel fm);
    
    FacturaController getController();
    void setController(FacturaController fc);
    
    void dataModelChanged();
    void display();
}
