package modelo;

import controlador.FacturaController;
import java.util.List;
import modelo.entidades.Factura;
import modelo.persistencia.FacturaDAO;
import modelo.persistencia.JDBC.FacturaDAOJDBC;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public class FacturaModelImpl implements FacturaModel{

    private FacturaController controller;
    
    @Override
    public FacturaController getController() {
        return this.controller;
    }

    @Override
    public void setController(FacturaController controller) {
        this.controller = controller;
    }

    @Override
    public void nuevaFactura(Factura factura) {
        FacturaDAO dao = obtenerImplementacionFacturaDAO();
        dao.create(factura);
        this.controller.fireDataModelChanged();
    }

    @Override
    public Factura obtenerFactura(String nombre) {
        FacturaDAO dao = obtenerImplementacionFacturaDAO();
        return dao.read(nombre);
    }

    @Override
    public void eliminarFactura(Factura factura) {
        FacturaDAO dao = obtenerImplementacionFacturaDAO();
        dao.delete(factura);
        this.controller.fireDataModelChanged();
    }

    @Override
    public void actualizarFactura(Factura factura) {
        FacturaDAO dao = obtenerImplementacionFacturaDAO();
        dao.update(factura);
        this.controller.fireDataModelChanged();
    }

    @Override
    public List<Factura> obtenerFacturas() {
        FacturaDAO dao = obtenerImplementacionFacturaDAO();
        return dao.list();
    }

    private FacturaDAO obtenerImplementacionFacturaDAO() {
        return new FacturaDAOJDBC();
    }

    @Override
    public List<Factura> listarPorCliente(String nombre) {
        FacturaDAO dao=(FacturaDAO)obtenerImplementacionFacturaDAO();
        return dao.listByCliente(nombre);
    }
    
}
