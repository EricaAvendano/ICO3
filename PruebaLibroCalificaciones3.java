import java.util.Scanner;

public class PruebaLibroCalificaciones3{

    public PruebaLibroCalificaciones3(){

    }

    public static void main (String args []){
        Scanner entrada = new Scanner (System. in);

        LibroCalificaciones3 miLibroCalificaciones3 = new LibroCalificaciones3();

        LibroCalificaciones3 miLibroCalificaciones3Iniciado = new LibroCalificaciones3(
            "ICO III", "Cuauhtemoc", 4);

            System.out.printf("El nombre inicial del curso: %s\nEl profesor es: %s\ny las horas a la semana son: %s\n\n",
                miLibroCalificaciones3Iniciado.obtenerNombreDelCurso(), miLibroCalificaciones3Iniciado.obtenerNombreDelProfesor(),
                miLibroCalificaciones3Iniciado.obtenerHorasDelCurso());

            System.out.println("Escriba el nombre del curso: ");
            String elNombre = entrada.nextLine();
            
            System.out.println("Escriba el nombre del profesor: ");
            String elProfe = entrada.nextLine();

            System.out.println("Escriba las horas por semana del curso: ");
            int horasSemana = entrada.nextInt();

            System.out.println();

                miLibroCalificaciones3.establecerParametrosDelCurso(elNombre, elProfe, horasSemana);
                miLibroCalificaciones3.mostrarMensaje();
                entrada.nextLine();

            System.out.println("Vamos a cambiar los valores del objeto mLCIniciado");
            System.out.println("Escriba el nuevo nombre del curso para el objeto mLCIniciado: ");
            elNombre = entrada.nextLine();

            System.out.println("Escriba el nuevo nombre del profesor para el objeto mLCIniciado: ");
            elProfe = entrada.nextLine();

            System.out.println("Escriba la nueva cantiddad de horas por semana del curso para el objeto mLCIniciado: ");
            horasSemana = entrada.nextInt();

                miLibroCalificaciones3Iniciado.establecerParametrosDelCurso(elNombre, elProfe, horasSemana);
                miLibroCalificaciones3Iniciado.mostrarMensaje();
      
    }
}