package EjercicioClase;

public abstract class Persona {
 protected  String nombre,apellido,dni;

 public Persona(){}

 public Persona(String nombre,String apellido,String dni)
 {
     this.nombre = nombre;
     this.apellido = apellido;
     this.dni = dni;
 }

 public void mostrarDatos()
  {
      System.out.println("Nombre: " + this.nombre);
      System.out.println("Apellido: " + this.apellido);
      System.out.println("Dni: " + this.dni);

  }
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

    public abstract void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento);
}
