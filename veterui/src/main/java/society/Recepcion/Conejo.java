package society.Recepcion;

import java.util.Date;

public class Conejo extends Mascota {

    public Conejo(String Alergias, String Enfermedades, String Raza, int años, String dueño, String nombre, double peso, Date visita) {
        super(Alergias, Enfermedades, Raza, años, dueño, nombre, peso, visita);
    }
    
    @Override
    public double calculardosisdesparasitante() {
    return getPeso() * 0.2;
    }

    @Override
    public String obteneralertamedica() {
        return "Conejo: Revisar por posibles problemas dentales y asegurarse de que tenga suficiente vitamina C en su dieta.";
    }
}
