package EjercicioClase;

public  final class Directivo extends Persona implements Comision{
    private int capital;

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int capital) {
        super(nombre, apellido, dni);
        this.capital = capital;
    }

    @Override
    public void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super.mostrarDatos();
        System.out.println("Capital" + capital);
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public double votar() {
        double votar = (int)((Math.random() * 10)+ 1)/2;
        return votar;
    }

    @Override
    public void obtenerBeneficio(double beneficio) {
        System.out.println("El beneficio obtenido es: " + beneficio * 0.20);
    }
}
