public class MontañaRusa extends Atraccion implements Mantenimiento {
    private String intensidad;
    private boolean necesitaMantenimiento;

    public MontañaRusa(String nombre, int capacidadMaxima, int duracion, String intensidad) {
        super(nombre, capacidadMaxima, duracion);
        this.intensidad = intensidad;
        this.necesitaMantenimiento = false;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public void aumentarIntensidad() {
        // Supongamos que las intensidades son "baja", "media", "alta".
        switch (intensidad) {
            case "baja":
                intensidad = "media";
                break;
            case "media":
                intensidad = "alta";
                break;
            case "alta":
                System.out.println("La intensidad ya está en el nivel máximo");
                break;
        }
    }

    @Override
    public void iniciar() {
        System.out.println("La montaña rusa está en marcha");
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
