package Examen;

public class Entrada {
    public static void main(String[] args) {
        Seleccion selecccion = new Seleccion("colombia");
        Jugador jugador1 = new Jugador("Andres", "Franco", "179874B", 26, 23.00,"delantero");
        Jugador jugador2 = new Jugador("mario", "suarez", "2598Y", 24,25.00, "delantero");
        Jugador jugador3 = new Jugador("Juan", "betancur", "59874t", 28,29.00, "medio");
        Jugador jugador4 = new Jugador("Jose", "Marulanda", "578874B", 22,23.00, "defensa");

        selecccion.contratarJugador(jugador1);
        selecccion.contratarJugador(jugador2);
        selecccion.contratarJugador(jugador3);
        selecccion.contratarJugador(jugador4);
        Entrenador entrenador1 = new Entrenador("Borja", "Martin", "67976464t", 28, 25.00, "Defensa");
        Entrenador entrenador2 = new Entrenador("Andres", "Marulanda", "797464Y", 27,29.00, "Ofensiva");
        selecccion.contratarEntrenador(entrenador1);
        selecccion.contratarEntrenador(entrenador2);

        selecccion.verPosicion("delantero");
        selecccion.getGastos();
        selecccion.verPlantilla();
    }
}
