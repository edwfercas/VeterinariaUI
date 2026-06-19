package society.Recepcion;

import java.util.ArrayList;
import java.util.List;

public class GestorCitas implements IGestorcitas {
    private List<Cita> citas = new ArrayList<>();
    @Override
    public boolean registrarCita(Cita cita) {
        return citas.add(cita);
    }
    @Override
    public boolean cancelarCita(int idCita) {
        return citas.removeIf(c -> c.getIdCita() == idCita);
    }
    @Override
    public Cita buscarCitaPorId(int idCita) {
        return citas.stream()
                .filter(c -> c.getIdCita() == idCita)
                .findFirst()
                .orElse(null);
    }
    @Override
    public void enviarRecordatorio(Cita cita) {
        System.out.println("Recordatorio: Tienes una cita con " + cita.getMascota().getNombre() + " el " + cita.getFechaCita());
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}
