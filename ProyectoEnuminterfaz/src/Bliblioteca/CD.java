package Bliblioteca;

public final class CD extends Elemento implements Prestar {
    private String anioED;
    private TipoCD tipo;

    public CD() {}

    public CD(int id, String seccion, String titulo, String anioED, TipoCD tipo) {
        super(id, seccion, titulo);
        this.anioED = anioED;
        this.tipo = tipo;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    public String getAnioED() {
        return anioED;
    }

    public void setAnioED(String anioED) {
        this.anioED = anioED;
    }

    public TipoCD getTipo() {
        return tipo;
    }

    public void setTipo(TipoCD tipo) {
        this.tipo = tipo;
    }
}
