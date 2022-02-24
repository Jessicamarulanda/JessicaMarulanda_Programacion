package Examen;

public class Entrada {
    public static void main(String[] args) {
        Seleccion selecccion = new Seleccion("colombia");
        Jugador jugador1 = new Jugador("Andres","Franco","179874B",26,"delantero",23.00);
        Jugador jugador2 = new Jugador("mario","suarez","2598Y",24,"delantero",25.00);
        Jugador jugador3 = new Jugador("Juan","betancur","59874t",28,"medio",29.00);
        Jugador jugador4 = new Jugador("Jose","Marulanda","578874B",22,"defensa",23.00);

       selecccion.contratarJugador(jugador1);
       selecccion.contratarJugador(jugador2);
       selecccion.contratarJugador(jugador3);
       selecccion.contratarJugador(jugador4);

       Entrenador entrenador1 = new Entrenador("Borja","Martin","67976464t",28,"Defensa",25.00);
       Entrenador entrenador2 = new Entrenador("Andres","Marulanda","797464Y",27,"Ofensiva",29.00);

       selecccion.contratarEntrenador(entrenador1);
       selecccion.contratarEntrenador(entrenador2);

       selecccion.verPosicion("delantero");
       System.out.println(selecccion.sumaGastos());
       selecccion.verPlantilla();
    }
}
