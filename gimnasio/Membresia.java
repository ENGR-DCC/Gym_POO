package gimnasio;

import java.util.List;

public class Membresia {
    private String tipo;
    private double precio;
    private int duracion; // en meses
    private List<String> beneficios;

    public Membresia(String tipo, double precio, int duracion, List<String> beneficios) {
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
        this.beneficios = beneficios;
    }

    // Métodos
    public double calcularCosto() {
        return precio;
    }

    public List<String> mostrarBeneficios() {
        return beneficios;
    }
}
