package society.Recepcion;

public interface IGestorcitas {
    boolean registrarCita(Cita cita);
    boolean cancelarCita(int idCita);
    Cita buscarCitaPorId(int idCita);
    void enviarRecordatorio(Cita cita);
}
