package society.Recepcion;

import java.util.Date;

public class Gato extends Mascota {
    private boolean esdeinterior=true;

    

    public Gato(String Alergias, String Enfermedades, String Raza, int años, String dueño, String nombre, double peso,
            Date visita, boolean esdeinterior) {
        super(Alergias, Enfermedades, Raza, años, dueño, nombre, peso, visita);
        this.esdeinterior = esdeinterior;
    }

    @Override
    public double calculardosisdesparasitante() {
        return getPeso()*0.5;
    }

    @Override
    public String obteneralertamedica() {
        return esdeinterior ? "El gato es de interior: Riesgo bajo de parásitos externos." : "El gato no es de interior: Revisar por pulgas/garrapatas.";        
    }

    public boolean isEsdeinterior() {
        return esdeinterior;
    }

    public void setEsdeinterior(boolean esdeinterior) {
        this.esdeinterior = esdeinterior;
    }



}