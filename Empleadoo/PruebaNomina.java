public class PruebaNomina {

    public static void main(String[] args) {

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
            "Andrea", "Torres", "123-345-456", 800.00);

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(
            "Karen", "Armenta", "234-755-853", 50.50, 40);

        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
            "Steve", "Sanders", "678-374-557", 20000, 0.06);

        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
            "Miriam", "Estrada", "786-568-380", 15000, 0.04, 400.00);

        // procesamiento de empleados por separado
        System.out.println("Empleados procesados por separado:");

        System.out.printf("%n%s%n%s: $%,.2f%n",
            empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());

        System.out.printf("%n%s%n%s: $%,.2f%n",
            empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());

        System.out.printf("%n%s%n%s: $%,.2f%n",
            empleadoPorComision, "ingresos", empleadoPorComision.ingresos());

        System.out.printf("%n%s%n%s: $%,.2f%n",
            empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());
    }
}