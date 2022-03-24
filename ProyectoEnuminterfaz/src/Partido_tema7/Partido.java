package Partido_tema7;

public class Partido {
    private int golesLocal,golesVisitante;
    private boolean jugado;
    private Equipo local,visitante;

    public void mostrarResultado()
    {
        System.out.println("%s: %d - %s:%d");
    }

    public void agregarGoleSLocales()
    {
        golesLocal += (int)(Math.random()*3);
    }
    public void agregarGolesVisitante()
    {
        golesVisitante += (int)(Math.random()*3);
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Partido(){}

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    class Equipo
    { String nombre;
        int puntos;

        public Equipo(String nombre) {
            this.nombre = nombre;
            if(nombre.equalsIgnoreCase("Atelti"))
            {
                setLocal(this);
            }else if(nombre.equalsIgnoreCase("sevilla"))
            {
                setVisitante(this);
            }
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }
    }
}
