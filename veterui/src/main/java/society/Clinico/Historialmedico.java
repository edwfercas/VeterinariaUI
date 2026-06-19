package society.Clinico;
import java.util.ArrayList;
import java.util.List;

import society.Recepcion.Mascota;

public class Historialmedico {
    private Mascota mascota;
    private List<Consulta> consultas = new ArrayList<>();

    public Historialmedico(Mascota mascota) {
        this.mascota = mascota;
    }



    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void mostrarHistorial() {
        System.out.println("Historial médico de " + mascota.getNombre() + " (" + mascota.getDueño() + ")");
        for (Consulta c : consultas) {
            c.mostrarInfo();
        }
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
        public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
