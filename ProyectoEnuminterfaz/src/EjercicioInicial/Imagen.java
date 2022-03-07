package EjercicioInicial;

public final class Imagen extends Elemento implements Ejecutable {
    private String ISBN;

    public Imagen() {}

    public Imagen(String identificador, String titulo, String autor, String formato, double tamanio, String ISBN) {
        super(identificador, titulo, autor, formato, tamanio);
        this.ISBN = ISBN;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
