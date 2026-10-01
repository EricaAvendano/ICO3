public class EmpleadoPorHoras extends Empleado {

    private double sueldo; // sueldo por hora
    private double horas;  // horas trabajadas en la semana

    // constructor
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, double sueldo, double horas) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // validar sueldo
        if (sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        // validar horas
        if (horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException(
                "Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.sueldo = sueldo;
        this.horas = horas;
    }

    // set y get del sueldo
    public void establecerSueldo(double sueldo) {
        if (sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        this.sueldo = sueldo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    // set y get de las horas
    public void establecerHoras(double horas) {
        if (horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException(
                "Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.horas = horas;
    }

    public double obtenerHoras() {
        return horas;
    }

    // calcula los ingresos; las horas arriba de 40 se pagan a 1.5 veces
    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40) // hasta 40 horas, no hay horas extra
            return obtenerHoras() * obtenerSueldo();
        else
            return 40 * obtenerSueldo()
                + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %.2f",
            super.toString(), "sueldo por horas", obtenerSueldo(),
            "total de horas trabajadas", obtenerHoras());
    }
}