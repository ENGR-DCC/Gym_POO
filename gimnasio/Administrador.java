package gimnasio;

import java.util.List;

public class Administrador extends Persona {

    public Administrador(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    public void consultarEstadoEquipos(List<Equipo> equipos) {
        for (Equipo equipo : equipos) {
            System.out.println("Estado del equipo: " + equipo.getEstado());
        }
    }

    public void gestionarMantenimiento(Equipo equipo) {
        equipo.registrarMantenimiento();
    }
}