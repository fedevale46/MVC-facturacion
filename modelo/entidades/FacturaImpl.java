package modelo.entidades;

import java.util.Date;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class FacturaImpl implements Factura {

    private String identificador;
    private Cliente cliente;
    private Double importe;
    private Date fecha;

    public FacturaImpl(String identifiador, Cliente cliente, Double importe, Date fecha) {
        this.identificador = identifiador;
        this.cliente = cliente;
        this.importe = importe;
        this.fecha = fecha;
    }

    public FacturaImpl(String identificador) {
        this(identificador,null,null,null);
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public Double getImporte() {
        return this.importe;
    }

    @Override
    public void setIdentificador(String id) {
        this.identificador = id;
    }

    @Override
    public Date getFecha() {
        return this.fecha;
    }

    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
