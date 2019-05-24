package modelo;

import modelo.entidades.Cliente;
import controlador.ClienteController;
import java.util.List;
import modelo.persistencia.ClienteDAO;
import modelo.persistencia.JDBC.ClienteDAOJDBC;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class ClienteModelImpl implements ClienteModel {
    

    private ClienteController controller;
            
    @Override
    public ClienteController getController() {
        return this.getController();
    }

    @Override
    public void setController(ClienteController controller) {
        this.controller = controller;
    }

    @Override
    public void nuevoCliente(Cliente cliente) {
        ClienteDAO dao = obtenerImplementaciónClienteDAO();
        dao.create(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public Cliente obtenerCliente(String nombre) {
        ClienteDAO dao = obtenerImplementaciónClienteDAO();
        return dao.read(nombre);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        ClienteDAO dao = obtenerImplementaciónClienteDAO();
        dao.delete(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        ClienteDAO dao = obtenerImplementaciónClienteDAO();
        dao.update(cliente);
        this.controller.fireDataModelChanged();
    }

    @Override
    public List<Cliente> obtenerClientes() {
        ClienteDAO dao = obtenerImplementaciónClienteDAO();
        return dao.list();
    }

    private ClienteDAO obtenerImplementaciónClienteDAO() {
        return new ClienteDAOJDBC();
    }
}
