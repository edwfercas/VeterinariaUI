package society.Clinico;
import java.util.Date;

import society.Recepcion.Mascota;

public class Consulta {
    private int id;
    private Mascota mascota;
    private Veterinario veterinario;
    private String diagnostico;
    private Date fecha;

    public Consulta(String diagnostico, Date fecha, int id, Mascota mascota, Veterinario veterinario) {
        this.diagnostico = diagnostico;
        this.fecha = fecha;
        this.id = id;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void mostrarInfo() {
        System.out.println("Consulta #" + id + " - Mascota: " + mascota.getNombre() + ", Veterinario: " + veterinario.getNombre() + ", Diagnóstico: " + diagnostico + ", Fecha: " + fecha);
    }
}
