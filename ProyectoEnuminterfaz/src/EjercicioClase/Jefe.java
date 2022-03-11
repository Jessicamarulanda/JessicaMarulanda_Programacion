package EjercicioClase;

public  final class Jefe  extends Trabajador implements Comision{
    private int numeroTrabajadores;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numeroTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super.mostrarDatos();
        System.out.println("Numero trabajadores" + numeroTrabajadores);
    }

    @Override
    public void calcularSueldo() {

    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    @Override
    public double votar() {
        double votar = (int)((Math.random() * 10)+ 1)/3;
        return votar;
    }

    @Override
    public void obtenerBeneficio(double beneficio)
    {
        this.sueldo += beneficio * 0.10;
    }
}
