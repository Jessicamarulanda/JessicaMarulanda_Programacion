package EjercicioInicial;

public  final class Audio extends Elemento implements Ejecutable {
    private double duracion;
    private String soporte;

    public Audio() {}

    public Audio(String identificador, String titulo, String autor, String formato, double tamanio, double duracion, String soporte) {
        super(identificador, titulo, autor, formato, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public boolean Ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
