package society.Clinico;

import society.Recepcion.Mascota;

public interface IGestorconsulta {
    boolean registrarConsulta(Consulta consulta);
    Historialmedico obtenerHistorialPorMascota(Mascota mascota);
}
