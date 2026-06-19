package society.Farmacia;

public class Alimento extends Producto {
    private String tipo;

    public Alimento(String id, String nombre, double precio, int stock, String tipo) {
        super(id, nombre, precio, stock);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String obtenerInfo() {
        return "Alimento: " + getNombre() + ", Tipo: " + tipo + ", Precio: $" + getPrecio();
    }
}
