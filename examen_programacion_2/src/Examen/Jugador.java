package Examen;

public class Jugador extends Persona {
    private String posicion;

    public Jugador() {

    }

    public Jugador(String nombre, String apellido, String dni, int edad,double sueldo,String posicion) {
        super(nombre, apellido, dni, edad,sueldo);
        this.posicion = posicion;
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo * (this.sueldo/2);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posición:" + this.posicion);
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
