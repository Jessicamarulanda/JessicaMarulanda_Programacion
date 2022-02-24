package Examen;

public class Entrenador extends Persona {
    private String vocacion;
    private Double sueldo;

    public Entrenador() {}

    public Entrenador(String nombre, String apellido, String dni, int edad, String vocacion, Double sueldo) {
        super(nombre, apellido, dni, edad);
        this.vocacion = vocacion;
        this.sueldo = sueldo;
    }

    @Override
    public void calcularSueldo()
    {
        this.sueldo = sueldo + (sueldo/4);
    }
    @Override
    public void mostrarDatos()
    { super.mostrarDatos();
        System.out.println("Vocación:" + this.vocacion);
        System.out.println("Sueldo:" + this.sueldo);
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
