// Clase Main para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Miau", 3);

        // Probar los métodos en Perro
        perro.hacerSonido(); // Salida: El perro ladra
        perro.comer();       // Salida: El perro está comiendo
        perro.beber();       // Salida: El perro está bebiendo
        perro.dormir();      // Salida: El animal está durmiendo
        perro.hacerTruco(); // Salida: El perro está haciendo un truco
        perro.hacerTruco("saltos"); // Salida: El perro está haciendo el truco: saltos

        // Probar los métodos en Gato
        gato.hacerSonido(); // Salida: El gato maúlla
        gato.comer();       // Salida: El gato está comiendo
        gato.beber();       // Salida: El gato está bebiendo
        gato.dormir();      // Salida: El animal está durmiendo
    }
}
