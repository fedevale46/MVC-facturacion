package controlador;

import java.util.Date;
import java.util.List;
import modelo.FacturaModel;
import modelo.entidades.Cliente;
import vista.factura.FacturaView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface FacturaController {
    //Metodo para enlazar la vista y el modelo
    void setup(FacturaModel model, List<FacturaView> view);
    //Metodo para lanzar la aplicación MVC
    void start();

    void addView(FacturaView view);
    void removeView(FacturaView view);

    FacturaModel getModel();
    void setModel(FacturaModel model);

    //Métodos a los que la vista llamará. Por ahora permitimos crear nuevos clientes
    void nuevaFacturaGesture(String id, Cliente cliente, String importe, Date fecha);
    void borraFacturaGesture(String id);
    void actualizaFacturaGesture(String id, Cliente cliente, String importe, Date fecha);

    //Métodos que el modelo puede llamar
    void fireDataModelChanged();

    
}
