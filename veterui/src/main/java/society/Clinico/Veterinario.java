package society.Clinico;

public class Veterinario {
    private int id;
    private String nombre;
    private String especialidad;

    public Veterinario(String especialidad, int id, String nombre) {
        this.especialidad = especialidad;
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
