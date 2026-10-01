public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    // constructor: crea un objeto con sus características iniciales
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, double salarioSemanal) {

        // llamada al constructor de la superclase Empleado
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // validación: el salario no puede ser menor que 0
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // set: permite cambiar el salario después de crear el objeto
    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // get: devuelve el salario
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    // sobrescribe el método ingresos
    @Override
    public double ingresos() {
        return obtenerSalarioSemanal();
    }

    // sobrescribe el método toString
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s%n%s: $%,.2f",
            super.toString(), "Salario semanal", obtenerSalarioSemanal());
    }
}