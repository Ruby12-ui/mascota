package vallegrande.edu.pe.mascota;

public class main {
    public static void main(String[] args) {

        // Crear objeto mascota
        mascota mascota = new mascota("Firulais", "Perro", 3);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        mascota.mostrarInformacion();

        // Cumple años
        mascota.cumplirAnios();

        // Mostrar información actualizada
        System.out.println("\nDespués de cumplir años:");
        mascota.mostrarInformacion();
    }
}