public class Noria extends Atraccion implements Mantenimiento {
    private int alturaMaxima;
    private boolean necesitaMantenimiento;

    public Noria(String nombre, int capacidadMaxima, int duracion, int alturaMaxima) {
        super(nombre, capacidadMaxima, duracion);
        this.alturaMaxima = alturaMaxima;
        this.necesitaMantenimiento = false;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void iniciar() {
        System.out.println("La noria está girando");
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
