public class PruebaEmpleado {

    public static void main(String[] args) {

        // crea un objeto de cada subclase
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado(
            "Juan", "Lopez", "111-11-1111", 800.00);

        EmpleadoPorComision porComision = new EmpleadoPorComision(
            "Karen", "Saucedo", "222-22-2222", 10000, .06);

        EmpleadoBaseMasComision baseMasComision = new EmpleadoBaseMasComision(
            "Ana", "Lesiana", "333-33-3333", 5000, .04, 300);

        // arreglo de tipo Empleado (polimorfismo)
        Empleado[] empleados = {asalariado, porComision, baseMasComision};

        System.out.println("Empleados procesados polimorficamente:\n");

        for (Empleado actual : empleados) {
            System.out.println(actual); // llama al toString de cada subclase
            System.out.printf("ingresos $%,.2f%n%n", actual.ingresos());
        }
    }
}