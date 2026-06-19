package society.Caja;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private String id;
    private Date fecha;
    private List<Detalleventa> detalles = new ArrayList<>();
    private Metododepago metododepago;
    private double total;

    public Venta(Date fecha, String id, Metododepago metododepago, double total) {
        this.fecha = fecha;
        this.id = id;
        this.metododepago = metododepago;
        this.total = total;
    }


    public void agregarDetalle(Detalleventa detalle) {
        detalles.add(detalle);
        calcularTotal();
    }

    private void calcularTotal() {
        total = detalles.stream().mapToDouble(Detalleventa::calcularSubtotal).sum();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Detalleventa> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalleventa> detalles) {
        this.detalles = detalles;
    }

    public Metododepago getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(Metododepago metododepago) {
        this.metododepago = metododepago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}   
