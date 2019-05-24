package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.entidades.Cliente;
import modelo.entidades.ClienteImpl;
import modelo.ClienteModel;
import vista.cliente.ClienteView;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class ClienteControllerImpl implements ClienteController {

    private ClienteModel model;
    
    private List <ClienteView> views;

    public ClienteControllerImpl() {
        this.views = new ArrayList<ClienteView>();
    }
    
    @Override
    public void setup(ClienteModel model, List<ClienteView> views) {
        this.model = model;
        model.setController(this);
        this.addViews(views);
    }

    @Override
    public void start() {
        for (ClienteView v: this.views) {
            v.display();
        }
    }

    private void addViews(List <ClienteView> views) {
        for (ClienteView c: views) {
            this.addView(c);
        }
    }
    
    @Override
    public void addView(ClienteView view) {
        view.setModel(this.model);
        view.setController(this);
        this.views.add(view);
    }

    @Override
    public void removeView(ClienteView view) {
        this.views.remove(view);
    }

    @Override
    public ClienteModel getModel() {
        return this.model;
    }

    @Override
    public void setModel(ClienteModel model) {
        this.model = model;
    }

    @Override
    public void nuevoClienteGesture(String dni, String nombre, String direccion) {
        Cliente cliente = new ClienteImpl(dni, nombre, direccion);
        this.model.nuevoCliente(cliente);
    }

    @Override
    public void borraClienteGesture(String dni) {
        Cliente cliente = new ClienteImpl(dni);
        this.model.eliminarCliente(cliente);
    }

    @Override
    public void actualizaClienteGesture(String dni, String nombre, String direccion) {
        Cliente cliente = new ClienteImpl(dni, nombre, direccion);
        this.model.actualizarCliente(cliente);
    }

    @Override
    public void fireDataModelChanged() {
        for (ClienteView v: this.views) {
            v.display();
        }
    }
}
