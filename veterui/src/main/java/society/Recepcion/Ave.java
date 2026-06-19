package society.Recepcion;

import java.util.Date;

public class Ave extends Mascota {
    private boolean vuelalibre;

    public Ave(boolean vuelalibre, String Alergias, String Enfermedades, String Raza, int años, String dueño, String nombre, double peso, Date visita) {
        super(Alergias, Enfermedades, Raza, años, dueño, nombre, peso, visita);
        this.vuelalibre = vuelalibre;
    }

    

    public boolean isVuelalibre() {
        return vuelalibre;
    }

    public void setVuelalibre(boolean vuelalibre) {
        this.vuelalibre = vuelalibre;
    }

    @Override
    public double calculardosisdesparasitante() {
        return getPeso() / 0.1;
    }
    @Override
    public String obteneralertamedica() {
        return vuelalibre ? "Ave en semilibertad: Evaluar posibles traumatismos por choques en ventanas." : "El ave no vuela libre: Revisar el plumaje y posible estrés por estar enjaulado.";
    }

}
