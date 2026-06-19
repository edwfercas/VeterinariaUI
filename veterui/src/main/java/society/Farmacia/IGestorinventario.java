package society.Farmacia;

import java.util.List;

public interface IGestorinventario {
    boolean agregarProducto(Producto producto);
    boolean eliminarProducto(String id);
    Producto buscarProductoPorId(String id);
    List<Producto> listarProductos();
    void actualizarStock(String id, int nuevoStock);
}
