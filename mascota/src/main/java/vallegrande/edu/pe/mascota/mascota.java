package vallegrande.edu.pe.mascota;

public class mascota {

    // Atributos
    private String nombre;
    private String tipo;
    private int edad;

    // Constructor
    public mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para cumplir años
    public void cumplirAnios() {
        edad++;
    }
}