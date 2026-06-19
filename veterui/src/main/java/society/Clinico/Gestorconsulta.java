package society.Clinico;

import java.util.ArrayList;
import java.util.List;  

import society.Recepcion.Mascota;

public class Gestorconsulta implements IGestorconsulta {
    private List<Historialmedico> historiales = new ArrayList<>();
    
  @Override
    public boolean registrarConsulta(Consulta consulta) {
        Mascota mascota = consulta.getMascota();

        Historialmedico historial = historiales.stream()
            .filter(h -> h.getMascota().equals(mascota))
            .findFirst()
            .orElse(null);

        if (historial == null) {
            historial = new Historialmedico(mascota);
            historiales.add(historial);
        }
        historial.agregarConsulta(consulta);
        return true;
    }
    @Override
    public Historialmedico obtenerHistorialPorMascota(Mascota mascota) {
        return historiales.stream()
                .filter(h -> h.getMascota().equals(mascota))
                .findFirst()
                .orElse(null);
    }

    public List<Historialmedico> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(List<Historialmedico> historiales) {
        this.historiales = historiales;
    }
    
}
