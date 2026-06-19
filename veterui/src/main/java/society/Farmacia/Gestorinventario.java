package society.Farmacia;

import java.util.ArrayList;
import java.util.List;

public class Gestorinventario implements IGestorinventario {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public boolean agregarProducto(Producto producto) {
        return productos.add(producto);
    }

    @Override
    public boolean eliminarProducto(String id) {
        return productos.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public Producto buscarProductoPorId(String id) {
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    @Override
    public void actualizarStock(String id, int nuevoStock) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setStock(nuevoStock);
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
