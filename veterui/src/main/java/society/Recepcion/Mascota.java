package society.Recepcion;
import java.util.Date;
public abstract class Mascota implements Comunes{
    private String nombre;
    private String dueño;
    private double peso;
    private String Alergias;
    private String Raza;
    private String Enfermedades;
    private int años;
    private java.util.Date visita;

    public Mascota(String Alergias, String Enfermedades, String Raza, int años, String dueño, String nombre, double peso, Date visita) {
        this.Alergias = Alergias;
        this.Enfermedades = Enfermedades;
        this.Raza = Raza;
        this.años = años;
        this.dueño = dueño;
        this.nombre = nombre;
        this.peso = peso;
        this.visita = visita;
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getEnfermedades() {
        return Enfermedades;
    }

    public void setEnfermedades(String Enfermedades) {
        this.Enfermedades = Enfermedades;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public Date getVisita() {
        return visita;
    }

    public void setVisita(Date visita) {
        this.visita = visita;
    }

    public void ultimavisita(){
        System.out.println("La ultima visita de " + nombre + " fue el " + visita);
    }
    
    public void mostrarinformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dueño: " + getDueño());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Alergias: " + getAlergias());
        System.out.println("Enfermedades: " + getEnfermedades());
        System.out.println("Años: " + getAños());
    }
}
