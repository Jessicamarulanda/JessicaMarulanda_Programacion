package ParteA;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> lista;
    private ArrayList numerosGerados = new ArrayList();
    private String nombre, dni;
    int numeroGenrado;
    int numeroAciertoJugador1, numeroAciertosjugador2;


    public Juego() {
        lista = new ArrayList();
    }

    public void agregarJugador(Jugador jugador) {
        lista.add(jugador);
    }

    public void Empieza(Jugador jugador1, Jugador jugador2) {

        for (int i = 0; i < 99; i++) {
            for (Carton carton : jugador1.cartones) {
                if (carton.getNumeros().equals(numeroGenrado)) {
                    numeroAciertoJugador1++;

                }
            }
            for (Carton carton : jugador2.cartones) {
                if (carton.getNumeros().equals(numeroGenrado)) {
                    numeroAciertosjugador2++;
                }
            }
        }
    }




        public String getDni () {
            return dni;
        }

        public String getNombre () {
            return nombre;
        }

        public ArrayList getNumerosGerados ( int numero){
            return numerosGerados;
        }
        public int getNumeroAciertoJugador1 () {
            return numeroAciertoJugador1;
        }


        public int getNumeroAciertosjugador2 () {
            return numeroAciertosjugador2;
        }


        public int getNumeroGenrado () {
            return numeroGenrado;
        }

        public void setNumeroAciertoJugador1 ( int numeroAciertoJugador1){
            this.numeroAciertoJugador1 = numeroAciertoJugador1;
        }

        public void setNumeroAciertosjugador2 ( int numeroAciertosjugador2){
            this.numeroAciertosjugador2 = numeroAciertosjugador2;
        }

        public void setNumeroGenrado ( int numeroGenrado){
            this.numeroGenrado = numeroGenrado;
        }

        public void setNumerosGerados (ArrayList numerosGerados){
            this.numerosGerados = numerosGerados;
        }


        public ArrayList<Jugador> getLista () {
            return lista;
        }

        public void setDni (String dni){
            this.dni = dni;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public void setLista (ArrayList < Jugador > lista) {
            this.lista = lista;
        }

    }


