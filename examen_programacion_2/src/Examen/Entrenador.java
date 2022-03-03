package Examen;

public class Entrenador extends Persona {
    private String vocacion;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, String dni, int edad, double sueldo, String vocacion) {
        super(nombre, apellido, dni, edad,sueldo);
        this.vocacion = vocacion;
    }

    @Override

    public void calcularSueldo() {
        //System.out.println(sueldo);
       this.sueldo = this.sueldo *0.25;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Vocación:" + this.vocacion);
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
