package Examen;

import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private ArrayList<Persona> lista;
    private double gastos;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
        this.gastos = sumaGastos();

    }

    public void contratarJugador(Jugador jugador) {
        if (!personaExiste(jugador)) {
            lista.add(jugador);
        } else {
            System.out.println("Persona ya existe en la lista");
        }
    }

    public void contratarEntrenador(Entrenador entrenador) {
        if (!personaExiste(entrenador)) {
            lista.add(entrenador);
        } else {
            System.out.println("Persona ya existe en la lista");
        }

    }

    public void verPosicion(String posicion) {
        System.out.println("Los jugadores en esa posición son:");
        for (Persona jugador : lista) {
            if (jugador instanceof Jugador) {
                if (((Jugador) jugador).getPosicion().equalsIgnoreCase(posicion)) {
                    jugador.mostrarDatos();
                }

            }
        }
    }

    public void verJugadores() {
        for (Persona item : lista) {
            if (item instanceof Jugador) {
                item.mostrarDatos();
            }

        }
    }

    public void verEntrenadores() {
        for (Persona item : lista) {
            if (item instanceof Entrenador) {
                item.mostrarDatos();
            }

        }
    }

    public void verPlantilla() {
        int jugadores = 0;
        int entrenadores = 0;
        for (Persona item : lista) {
            item.mostrarDatos();
            if (item instanceof Jugador) {
                jugadores++;
            } else {
                entrenadores++;
            }
        }
        System.out.println("El total de jugadores es: " + jugadores);
        System.out.println("El total de Entrenadores es: " + entrenadores);
    }

    public double sumaGastos() {
        double suma = 0;
        for (Persona item : lista) {
            if (item instanceof Jugador) {
                suma += ((Jugador) item).getSueldo();
            }
            if (item instanceof Entrenador) {
                suma += ((Entrenador) item).getSueldo();
            }
        }

        return suma;
    }

    private boolean personaExiste(Persona persona) {
        boolean existe = false;
        for (Persona item : lista) {
            if (item.getDni().equalsIgnoreCase(persona.getDni())) {
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
}
