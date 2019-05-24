package modelo.persistencia;

import java.util.List;
import modelo.entidades.Cliente;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface ClienteDAO {
    Cliente read(String pk);
    void create(Cliente cliente);
    void update(Cliente cliente);
    void delete(Cliente cliente);
    List <Cliente> list();
}
