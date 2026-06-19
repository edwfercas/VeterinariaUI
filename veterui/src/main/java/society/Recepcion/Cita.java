package society.Recepcion;

import java.util.Date;

public class Cita { 
        private Cliente cliente;
        private Mascota mascota;
        private int idCita;
        private Date fechaCita;

    public Cita(Cliente cliente, Date fechaCita, int idCita, Mascota mascota) {
        this.cliente = cliente;
        this.fechaCita = fechaCita;
        this.idCita = idCita;
        this.mascota = mascota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    @Override
    public String toString() {
        return "Cita [cliente=" + cliente + ", mascota=" + mascota + ", idCita=" + idCita + ", fechaCita=" + fechaCita
                + "]";
    }


    
}
