package society.Recepcion;

import java.util.Date;

public class Perro extends Mascota {
    private boolean Necesitabozal;

    public Perro(boolean Necesitabozal, String Alergias, String Enfermedades, String Raza, int años, String dueño, String nombre, double peso, Date visita) {
        super(Alergias, Enfermedades, Raza, años, dueño, nombre, peso, visita);
        this.Necesitabozal = Necesitabozal;
    }

   

    @Override
    public double calculardosisdesparasitante() {
        return getPeso()/10.00;
    }

    @Override
    public String obteneralertamedica() {
        return Necesitabozal ? "El perro necesita bozal." : "El perro no necesita bozal.";
    }
    
    @Override
    public void ultimavisita() {
    }

    public boolean isNecesitabozal() {
        return Necesitabozal;
    }

    public void setNecesitabozal(boolean Necesitabozal) {
        this.Necesitabozal = Necesitabozal;
    }
    
    
}
