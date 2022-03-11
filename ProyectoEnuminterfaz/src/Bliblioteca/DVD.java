package Bliblioteca;

public final class DVD extends Elemento {
    private String anioED, director, actores;
    private TipoDvd tipo;

    public DVD() {}

    public DVD(String id, String seccion, String titulo, String anioEDj, String director, String actores, TipoDvd tipo) {
        super(id, seccion, titulo);
        this.anioED = anioEDj;
        this.director = director;
        this.actores = actores;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año de edicion" + this.anioED);
        System.out.println("Director" + this.director);
        System.out.println("Actores" + this.actores);
        System.out.println("Tipo" + this.tipo.name());
    }

    public String getAnioED() {
        return anioED;
    }

    public void setAnioED(String anioED) {
        this.anioED = anioED;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public TipoDvd getTipo() {
        return tipo;
    }

    public void setTipo(TipoDvd tipo) {
        this.tipo = tipo;
    }
}