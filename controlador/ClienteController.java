package controlador;

import java.util.List;
import modelo.ClienteModel;
import vista.cliente.ClienteView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface ClienteController {
    //Metodo para enlazar la vista y el modelo
    void setup(ClienteModel model, List<ClienteView> view);
    //Metodo para lanzar la aplicación MVC
    void start();

    void addView(ClienteView view);
    void removeView(ClienteView view);

    ClienteModel getModel();
    void setModel(ClienteModel model);

    //Métodos a los que la vista llamará. Por ahora permitimos crear nuevos clientes
    void nuevoClienteGesture(String dni, String nombre, String direccion);
    void borraClienteGesture(String dni);
    void actualizaClienteGesture(String dni, String nombre, String direccion);

    //Métodos que el modelo puede llamar
    void fireDataModelChanged();


}
