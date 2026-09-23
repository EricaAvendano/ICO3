import java.util.Date;
import java.util.Scanner;

public class PruebaEstudiante
{
   public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.print("Nombre: ");
      String nombre = entrada.nextLine();

      System.out.print("Apellido paterno: ");
      String apellidoPaterno = entrada.nextLine();

      System.out.print("Apellido materno: ");
      String apellidoMaterno = entrada.nextLine();

      System.out.print("Año de nacimiento: ");
      int anio = entrada.nextInt();

      System.out.print("Numero de Mes de nacimiento: ");
      int mes = entrada.nextInt();

      System.out.print("Dia de nacimiento: ");
      int dia = entrada.nextInt();

      Date fechaNacimiento = new Date (anio - 1900, mes - 1, dia);
      entrada.nextLine();

      System.out.print("ID: ");
      String id = entrada.nextLine();

      System.out.print("Carrera: ");
      String carrera = entrada.nextLine();

      System.out.print("Grado obtenido: ");
      String grado = entrada.nextLine();

      System.out.print("Anio de graduacion: ");
      int anioGraduacion = entrada.nextInt();

      Estudiante estudiante = new Estudiante( nombre, apellidoPaterno, apellidoMaterno,
         fechaNacimiento, id, 0, carrera, grado, anioGraduacion);

      System.out.println("\nInformacion del estudiante:");
      System.out.println(estudiante);

      System.out.print("\nNumero de calificaciones: ");
      int numero = entrada.nextInt();

      entrada.nextLine();

      String[] calificaciones = new String[numero];

      for (int i = 0; i < numero; i++)
      {
         System.out.print("Calificacion " + (i + 1) + ": ");
         calificaciones[i] = entrada.nextLine();
      }

      estudiante.calcularPromedio(numero, calificaciones);

      System.out.printf("%nPromedio: %.2f%n", estudiante.obtenerPromedio());

      System.out.print("\nDesea cambiar de carrera?: ");
      String respuesta = entrada.nextLine();

      if 
      (respuesta.equals("si"))
      {
         System.out.print("Nueva carrera: ");
         String nuevaCarrera = entrada.nextLine();

         estudiante.cambiarCarrera(nuevaCarrera);

         System.out.println("Nueva carrera: " + estudiante.obtenerCarrera());
      }

      System.out.println("\nGracias");
      entrada.close();
   }
}