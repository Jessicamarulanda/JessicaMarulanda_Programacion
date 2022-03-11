package Bliblioteca;

public final class Libro extends Elemento implements Prestar{
    private String autor,editorial;
    private int numeroPginas;

    public Libro(){}

    public Libro(String id, String seccion, String titulo, String autor, String editorial, int numeroPginas,String ISBN) {
        super(id, seccion, titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.numeroPginas = numeroPginas;
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Autor: " + this.autor);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Numero de paginas: " + this.numeroPginas);
        System.out.println("ISBN: " + this.ISBN);
    }
    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPginas() {
        return numeroPginas;
    }

    public void setNumeroPginas(int numeroPginas) {
        this.numeroPginas = numeroPginas;
    }


}
