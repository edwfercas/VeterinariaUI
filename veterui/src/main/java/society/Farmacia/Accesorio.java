package society.Farmacia;

public class Accesorio  extends Producto {
    private String materiales;

    public Accesorio(String id, String nombre, double precio, int stock, String materiales) {
        super(id, nombre, precio, stock);
        this.materiales = materiales;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    @Override
    public String obtenerInfo() {
        return "Accesorio: " + getNombre() + ", Materiales: " + materiales + ", Precio: $" + getPrecio();
    }   

}
