// Clase Perro que extiende Animal e implementa Alimentable
class Perro extends Animal implements Alimentable {
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Implementación de métodos de la interfaz Alimentable
    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El perro está bebiendo");
    }

    // Sobrecarga del método hacerTruco
    public void hacerTruco() {
        System.out.println("El perro está haciendo un truco");
    }

    public void hacerTruco(String nombreTruco) {
        System.out.println("El perro está haciendo el truco: " + nombreTruco);
    }
}
