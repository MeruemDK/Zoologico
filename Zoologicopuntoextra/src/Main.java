public class Main {
    public static void main(String[] args) {
        MontañaRusa montañaRusa = new MontañaRusa("Montaña Rusa Extrema", 20, 5, "baja");
        Noria noria = new Noria("Noria Gigante", 40, 10, 50);
        AutitosChocadores autitosChocadores = new AutitosChocadores("Autitos Chocadores Divertidos", 30, 7, 10);

        montañaRusa.iniciar();
        montañaRusa.detener();
        montañaRusa.realizarMantenimiento();
        System.out.println("¿La montaña rusa necesita mantenimiento? " + montañaRusa.estadoMantenimiento());
        montañaRusa.aumentarIntensidad();
        System.out.println("Nueva intensidad de la montaña rusa: " + montañaRusa.getIntensidad());

        noria.iniciar();
        noria.detener();
        noria.realizarMantenimiento();
        System.out.println("¿La noria necesita mantenimiento? " + noria.estadoMantenimiento());

        autitosChocadores.iniciar();
        autitosChocadores.detener();
        autitosChocadores.realizarMantenimiento();
        System.out.println("¿Los autitos chocadores necesitan mantenimiento? " + autitosChocadores.estadoMantenimiento());
        autitosChocadores.iniciar(5);  // Sobrecarga del método iniciar
    }
}
