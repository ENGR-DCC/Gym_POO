package gimnasio;

import java.util.List;

public class Cliente extends Persona {
    private Membresia membresia;
    private List<Rutina> historialRutinas;
    private String objetivo;
    private String nivelExperiencia;

    public Cliente(String nombre, int edad, String genero, String objetivo, String nivelExperiencia) {
        super(nombre, edad, genero);
        this.objetivo = objetivo;
        this.nivelExperiencia = nivelExperiencia;
    }

    // Métodos
    public void asignarMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public void registrarEntrenamiento(Rutina rutina) {
        historialRutinas.add(rutina);
    }

    public List<Rutina> consultarHistorial() {
        return historialRutinas;
    }

    // Getters y Setters adicionales si es necesario
}
