public class LibroCalificaciones3 {
    private String nombreDelCurso, nombreDelProfesor;
    private int horasDelCurso;

    public LibroCalificaciones3(){

    }

    public LibroCalificaciones3(String nombre, String profesor, int horas){
        this.nombreDelCurso = nombre;
        this.nombreDelProfesor = profesor;
        this.horasDelCurso = horas;
    }

    public void establecerParametrosDelCurso(String nombre, String profesor, int horas){
        nombreDelCurso = nombre;
        nombreDelProfesor = profesor;
        horasDelCurso = horas;
    }

    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    public String obtenerNombreDelProfesor () {
        return nombreDelProfesor;
    }

    public int obtenerHorasDelCurso(){
        return horasDelCurso;
    }

    public void mostrarMensaje(){
        System.out.printf("Bienvenido libro de Calificaciones para\n%s\n", obtenerNombreDelCurso());

    System.out.printf("El profesor asignado es %s\n", obtenerNombreDelProfesor());

    System.out.printf("Tienes %d horas a la semana\n", obtenerHorasDelCurso());
    }
}