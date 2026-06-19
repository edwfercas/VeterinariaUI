package society.Farmacia;

public class Medicamento extends Producto {
    private String dosis;

    public Medicamento(String id, String nombre, double precio, int stock, String dosis) {
        super(id, nombre, precio, stock);
        this.dosis = dosis;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    @Override
    public String obtenerInfo() {
        return "Medicamento: " + getNombre() + ", Dosis: " + dosis + ", Precio: $" + getPrecio();
    }

}
