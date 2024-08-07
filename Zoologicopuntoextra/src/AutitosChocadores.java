public class AutitosChocadores extends Atraccion implements Mantenimiento {
    private int numeroDeAutitos;
    private boolean necesitaMantenimiento;

    public AutitosChocadores(String nombre, int capacidadMaxima, int duracion, int numeroDeAutitos) {
        super(nombre, capacidadMaxima, duracion);
        this.numeroDeAutitos = numeroDeAutitos;
        this.necesitaMantenimiento = false;
    }

    public int getNumeroDeAutitos() {
        return numeroDeAutitos;
    }

    public void setNumeroDeAutitos(int numeroDeAutitos) {
        this.numeroDeAutitos = numeroDeAutitos;
    }

    @Override
    public void iniciar() {
        System.out.println("Los autitos chocadores están en marcha");
    }

    public void iniciar(int autitosEnFuncionamiento) {
        System.out.println("Los autitos chocadores están en marcha con " + autitosEnFuncionamiento + " autitos en funcionamiento");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la atracción");
        necesitaMantenimiento = false;
    }

    @Override
    public boolean estadoMantenimiento() {
        return necesitaMantenimiento;
    }
}
