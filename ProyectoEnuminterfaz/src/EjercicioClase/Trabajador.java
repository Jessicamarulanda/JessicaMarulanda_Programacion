package EjercicioClase;

public  abstract  class Trabajador  extends Persona{
    protected double sueldo;
    protected Departamento departamento;

    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos(String nombre,String apellido,String dni,double sueldo,Departamento departamento)
    {  super.mostrarDatos();
      System.out.println("Sueldo: " + this.sueldo);
      System.out.println("Departamento: " + this.departamento);

    }


}
