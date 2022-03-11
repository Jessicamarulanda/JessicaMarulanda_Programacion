package EjercicioClase;

public  final class Accionista extends  Persona implements Comision{
    private int porcentajeAcciones;

    public Accionista() {}

    public Accionista(String nombre, String apellido, String dni, int porcentajeAcciones) {
        super(nombre, apellido, dni);
        this.porcentajeAcciones = porcentajeAcciones;
    }

    @Override
    public void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super.mostrarDatos();
        System.out.println("Acciones: " + porcentajeAcciones);
    }

    public int getPorcentajeAcciones() {
        return porcentajeAcciones;
    }

    public void setPorcentajeAcciones(int porcentajeAcciones) {
        this.porcentajeAcciones = porcentajeAcciones;
    }

    @Override
    public double votar() {
        double votar = (int)((Math.random() * 10)+ 1);
        return votar;
    }

    @Override
    public void obtenerBeneficio(double beneficio) {
    System.out.println("El beneficio obtenido es: " + beneficio * 30);
    }
}
