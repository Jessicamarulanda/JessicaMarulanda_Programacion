package Asignatura;

public class Profesor {
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((double) ((Math.random() * 10) + 1));
        alumno.getAsignatura2().setCalificacion((double) (Math.random() * 10) + 1);
        alumno.getAsignatura3().setCalificacion((double) (Math.random() * 10) + 1);

    }

    public double calcularNota(Alumno alumno){
        double media = 0;
        media = (alumno.getAsignatura1().getCalificacion() + alumno.getAsignatura2().getCalificacion()+ alumno.getAsignatura3().getCalificacion())/3;
        return media;
    }
    public void mostrarDatos (Alumno alumno){
        System.out.println("La nota de la primera asignatura es:" + alumno.getAsignatura1().getCalificacion()) ;
        System.out.println("La nota de la segunda asignatura es:" + alumno.getAsignatura2().getCalificacion()) ;
        System.out.println("La nota de la tercera asignatura es:" + alumno.getAsignatura3().getCalificacion()) ;
    }
}

