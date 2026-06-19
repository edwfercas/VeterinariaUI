package society.Caja;

import society.Farmacia.Producto;

public class Detalleventa {
    private Producto producto;
    private int cantidad;

    public Detalleventa(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}
