// Clase Gato que extiende Animal e implementa Alimentable
class Gato extends Animal implements Alimentable {
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    // Implementación de métodos de la interfaz Alimentable
    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El gato está bebiendo");
    }
}
