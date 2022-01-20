package Asignatura;

public class Alumno {
    private Asignatura asignatura1 , asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2,Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int identificador1, int identificador2 ,  int identificador3){
        asignatura1 = new Asignatura(identificador1);
        asignatura2 = new Asignatura(identificador2);
        asignatura3 =  new Asignatura(identificador3);

    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
}

