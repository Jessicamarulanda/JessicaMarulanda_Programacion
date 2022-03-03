package Examen;

public abstract class Persona {
    protected String nombre, apellido, dni;
    protected int edad;
    protected double sueldo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad,double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        calcularSueldo();

    }

    public void mostrarDatos() {
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Apellido:" + this.apellido);
        System.out.println("Dni:" + this.dni);
        System.out.println("Edad:" + this.edad);
        System.out.println(this.sueldo);

    }

    public abstract void calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


