package Examen;

public class Jugador extends Persona {
    private  String posicion;
    private  double sueldo;

    public Jugador(){

    }

    public Jugador(String nombre, String apellido, String dni, int edad, String posicion, double sueldo) {
        super(nombre, apellido, dni, edad);
        this.posicion = posicion;
        this.sueldo = sueldo;
    }

    @Override
    public void calcularSueldo()
    {
       this.sueldo = sueldo + (sueldo/2);
    }

    @Override
    public void mostrarDatos()
    { super.mostrarDatos();
        System.out.println("Posición:" + this.posicion);
        System.out.println("Sueldo:" + this.sueldo);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
