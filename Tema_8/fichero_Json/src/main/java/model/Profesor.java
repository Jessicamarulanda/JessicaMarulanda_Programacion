package model;

public class Profesor{
    String nombre,Apellido;

    public Profesor(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public void mostrarDatos()
    {
        System.out.println(nombre);
        System.out.println(Apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = Apellido;
    }
}
