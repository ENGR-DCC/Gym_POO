package gimnasio;

import java.util.List;

public class Entrenador extends Persona {
    private String especialidad;
    private List<Cliente> clientesAsignados;

    public Entrenador(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    // Métodos
    public void asignarCliente(Cliente cliente) {
        clientesAsignados.add(cliente);
    }

    public void planificarEntrenamiento(Cliente cliente, Rutina rutina) {
        // Lógica para planificar entrenamiento
    }

    public void consultarHorario() {
        // Lógica para consultar horario
    }
}
