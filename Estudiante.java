import java.util.Date;
public class Estudiante extends Persona
{
   private String id;
   private double promCalif;
   private String carrera;
   private String grado;
   private int anioGraduacion;

   public Estudiante(
      String nombre, 
      String apellidoPaterno,
      String apellidoMaterno, 
      Date fechaNacimiento,
      String id, 
      double promCalif, 
      String carrera,
      String grado, 
      int anioGraduacion)
   {
      super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
      this.id = id;
      this.promCalif = promCalif;
      this.carrera = carrera;
      this.grado = grado;
      this.anioGraduacion = anioGraduacion;
   }

   public String obtenerId() {
      return id;
   }

   public double obtenerPromedio(){
      return promCalif;
   }

   public String obtenerCarrera(){
      return carrera;
   }

   public String obtenerGrado(){
      return grado;
   }

   public int obtenerAnioGraduacion(){
      return anioGraduacion;
   }

   public void cambiarCarrera(String carrera){
      this.carrera = carrera;
   }

  public void calcularPromedio(int numeroCalificaciones, String[] calificaciones)
{
   double suma = 0;

   for (int i = 0; i < numeroCalificaciones; i++)
   {
      if (calificaciones[i].equals("A"))
         suma += 4;
      else if (calificaciones[i].equals("A-"))
         suma += 3.67;
      else if (calificaciones[i].equals("B+"))
         suma += 3.33;
      else if (calificaciones[i].equals("B"))
         suma += 3;
      else if (calificaciones[i].equals("B-"))
         suma += 2.67;
      else if (calificaciones[i].equals("C+"))
         suma += 2.33;
      else if (calificaciones[i].equals("C"))
         suma += 2;
      else if (calificaciones[i].equals("D"))
         suma += 1;
      else if (calificaciones[i].equals("F"))
         suma += 0;
      else 
         System.out.println("Entrada no valida, verificar que sean: A+, A, A-");
   }
   promCalif = suma / numeroCalificaciones;
}

   public String toString()
   {
      return String.format( "Nombre: %s%nFecha de nacimiento: %s%nID: %s%n" +
         "Promedio: %.2f%nCarrera: %s%nGrado: %s%n" +
         "Año de graduacion: %d",
         obtenerNombreCompleto(),
         obtenerFechaNacimiento(),
         obtenerId(),
         obtenerPromedio(),
         obtenerCarrera(),
         obtenerGrado(),
         obtenerAnioGraduacion());
   }
}
