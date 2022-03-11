package EjercicioClase;

public final class Asalariado extends Trabajador
{  private int numerosPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numerosPagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        numerosPagas = numerosPagas;
    }

    @Override
    public void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super.mostrarDatos();
        System.out.println("Pagas: " + numerosPagas);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Admin.IRPF);

    }

    public int getNumerosPagas() {
        return numerosPagas;
    }

    public void setNumerosPagas(int numerosPagas) {
        numerosPagas = numerosPagas;
    }
}
