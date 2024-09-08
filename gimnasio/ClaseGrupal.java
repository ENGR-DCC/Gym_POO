package gimnasio;

import java.util.List;

public class ClaseGrupal {
    private String nombre;
    private String tipo;
    private String horario;
    private Entrenador entrenador;
    private List<Cliente> clientesInscritos;

    public ClaseGrupal(String nombre, String tipo, String horario, Entrenador entrenador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.entrenador = entrenador;
    }

    // Métodos
    public void inscribirCliente(Cliente cliente) {
        clientesInscritos.add(cliente);
    }

    public List<Cliente> mostrarParticipantes() {
        return clientesInscritos;
    }

    public boolean consultarDisponibilidad() {
        // Lógica para consultar disponibilidad
        return true;
    }
}
